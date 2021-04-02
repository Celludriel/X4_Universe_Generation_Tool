package be.celludriel.universegenerator.main;

import be.celludriel.universegenerator.model.jobs.*;
import be.celludriel.universegenerator.model.xml.generated.*;
import be.celludriel.universegenerator.model.xml.generated.Modifiers;
import be.celludriel.universegenerator.model.xml.generated.Quota;
import be.celludriel.universegenerator.model.xml.generated.Time;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JobXmlToJsonConvertor {

    public static void main(String[] args) throws JAXBException, IOException {
        if(args.length == 0){
            throw new RuntimeException("You need to pass a jobs.xml file");
        }

        String xmlFile = args[0];

        JAXBContext context = JAXBContext.newInstance(Jobs.class);
        Jobs jobs = (Jobs) context.createUnmarshaller()
                .unmarshal(new FileReader(xmlFile));

        List<JsonJob> jsonJobList = loadJobList(jobs);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        String path = "output/jobs.json";
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), jsonJobList);
    }

    private static List<JsonJob> loadJobList(Jobs jobs) {
        List<JsonJob> jsonJobList = new ArrayList<>(jobs.getJob().size());

        for (Job job : jobs.getJob()) {
            jsonJobList.add(mapJob(job));
        }

        return jsonJobList;
    }

    /*
        @XmlElements({
        @XmlElement(name = "basket", type = Basket.class),
        @XmlElement(name = "category", type = Category.class),
        @XmlElement(name = "environment", type = Environment.class),
        @XmlElement(name = "location", type = Location.class),
        @XmlElement(name = "modifiers", type = Modifiers.class),
        @XmlElement(name = "orders", type = Orders.class),
        @XmlElement(name = "quota", type = Quota.class),
        @XmlElement(name = "time", type = Time.class)
    })
     */
    private static JsonJob mapJob(Job job) {
        JsonJob jsonJob = new JsonJob();

        Map<Class, Object> map = job.getBasketOrCategoryOrEnvironment().stream()
                .collect(Collectors.toMap(Object::getClass, object -> object));

        Basket basket = (Basket) map.get(Basket.class);
        Category category = (Category) map.get(Category.class);
        Environment environment = (Environment) map.get(Environment.class);
        Location location = (Location) map.get(Location.class);
        Modifiers modifiers = (Modifiers) map.get(Modifiers.class);
        Orders orders = (Orders) map.get(Orders.class);
        Quota quota = (Quota) map.get(Quota.class);
        Time time = (Time) map.get(Time.class);

        jsonJob.setId(job.getId());
        jsonJob.setName(job.getName());
        jsonJob.setStartActive(job.isStartactive());
        jsonJob.setDisabled(job.isDisabled());
        jsonJob.setComment(job.getComment());
        jsonJob.setBasket(basket != null ? basket.getBasket() : null);
        jsonJob.setEncounters(job.getEncounters() != null ? job.getEncounters().getId() : null);
        jsonJob.setTask(job.getTask() != null ? job.getTask().getTask() : null);

        jsonJob.setTime(mapTime(time));
        jsonJob.setCategory(mapCategory(category));
        jsonJob.setEnvironment(mapEnvironment(environment));
        jsonJob.setLocation(mapLocation(location));
        jsonJob.setModifiers(mapModifiers(modifiers));
        jsonJob.setOrder(mapOrder(orders));
        jsonJob.setQuota(mapQuota(quota));
        jsonJob.setShip(mapShip(job.getShip()));
        jsonJob.setMasstraffic(mapMassTraffic(job.getMasstraffic()));
        jsonJob.setSubordinates(mapSubordinates(job.getSubordinates()));
        jsonJob.setExpirationTime(mapExpirationTime(job.getExpirationtime()));

        return jsonJob;
    }

    private static JsonTime mapTime(Time time) {
        if(time != null){
            return new JsonTime(time.getInterval() != null ? time.getInterval().intValue() : null,
                    time.getStart() != null ? time.getStart().intValue() : null);
        }
        return null;
    }

    private static JsonExpirationTime mapExpirationTime(Expirationtime expirationtime) {
        if(expirationtime != null){
            return new JsonExpirationTime(expirationtime.getMin() != null ? expirationtime.getMin().intValue() : null,
                    expirationtime.getMax() != null ? expirationtime.getMax().intValue() : null);
        }
        return null;
    }

    private static List<String> mapSubordinates(Subordinates subordinates) {
        if(subordinates != null){
            List<Subordinate> subordinate = subordinates.getSubordinate();
            if(subordinate != null){
                ArrayList<String> jsonSubordinates = new ArrayList<>();
                for (Subordinate sub : subordinate) {
                    jsonSubordinates.add(sub.getJob());
                }
                return jsonSubordinates;
            }
        }
        return null;
    }

    private static JsonMassTraffic mapMassTraffic(Masstraffic masstraffic) {
        if(masstraffic != null){
            JsonMassTraffic jsonMassTraffic = new JsonMassTraffic();
            jsonMassTraffic.setRef(masstraffic.getRef());
            jsonMassTraffic.setRelaunchdelay(masstraffic.getRelaunchdelay() != null ?
                    masstraffic.getRelaunchdelay().intValue() : null);
            jsonMassTraffic.setRespawndelay(masstraffic.getRespawndelay() != null ?
                    masstraffic.getRespawndelay().intValue() : null);
            jsonMassTraffic.setOwner(mapOwner(masstraffic.getOwner()));
            return  jsonMassTraffic;
        }
        return null;
    }

    private static JsonShip mapShip(Ship ship) {
        if(ship != null){
            JsonShip jsonShip = new JsonShip();

            jsonShip.setSelect(mapSelect(ship.getSelect()));
            jsonShip.setLoadout(mapLoadout(ship.getLoadout()));
            jsonShip.setUnit(mapUnit(ship.getUnits()));
            jsonShip.setOwner(mapOwner(ship.getOwner()));
            jsonShip.setCargo(mapCargo(ship.getCargo()));
            jsonShip.setPilot(mapPilot(ship.getPilot()));

            return jsonShip;
        }
        return null;
    }

    private static JsonPilot mapPilot(Pilot pilot) {
        if(pilot != null){
            JsonPilot jsonPilot = new JsonPilot();
            jsonPilot.setMacro(pilot.getMacro());
            jsonPilot.setPage(mapPage(pilot.getPage()));
            return jsonPilot;
        }
        return null;
    }

    private static JsonPage mapPage(Page page) {
        if(page != null){
            JsonPage jsonPage = new JsonPage();
            jsonPage.setComment(page.getComment());
            jsonPage.setExact(page.getExact() != null ? page.getExact().intValue() : null);
            return jsonPage;
        }
        return null;
    }

    private static JsonCargo mapCargo(Cargo cargo) {
        if(cargo != null){
            Wares wares = cargo.getWares();
            if(wares != null){
                JsonCargo jsonCargo = new JsonCargo();
                Fillpercent fillpercent = wares.getFillpercent();
                if(fillpercent != null){
                    jsonCargo.setFillPercent(new JsonValueType(
                            fillpercent.getMax() != null ? fillpercent.getMax().toString() : null,
                            fillpercent.getMin() != null ? fillpercent.getMin().toString() : null,
                            fillpercent.getProfile()));
                }
                jsonCargo.setMultiple(wares.isMultiple());
                return jsonCargo;
            }
        }
        return null;
    }

    private static JsonOwner mapOwner(Owner owner) {
        if(owner != null){
            return new JsonOwner(owner.getExact(), owner.isOverridenpc());
        }
        return null;
    }

    private static JsonUnit mapUnit(Units units) {
        if(units != null){
            Unit unit = units.getUnit();
            if(unit != null){
                return new JsonUnit(unit.getCategory(),
                        unit.getMax() != null ? unit.getMax().intValue() : null,
                        unit.getMin() != null ? unit.getMin().intValue() : null);
            }
        }
        return null;
    }

    private static JsonLoadout mapLoadout(Loadout loadout) {
        if(loadout != null){
            JsonLoadout jsonLoadout = new JsonLoadout();

            Variation variation = loadout.getVariation();
            if(variation != null){
                jsonLoadout.setExact(variation.getExact() != null ? variation.getExact().intValue() : null);
            }

            Level level = loadout.getLevel();
            if(level != null) {
                JsonLevel jsonLevel = new JsonLevel();
                jsonLevel.setExact(level.getExact() != null ? level.getExact().doubleValue() : null);
                jsonLevel.setMin(level.getMin() != null ? level.getMin().doubleValue() : null);
                jsonLevel.setMax(level.getMax() != null ? level.getMax().doubleValue() : null);
                jsonLoadout.setLevel(jsonLevel);
            }

            return jsonLoadout;
        }
        return null;
    }

    private static JsonSelect mapSelect(Select select) {
        if(select != null){
            return new JsonSelect(select.getFaction(), select.getSize(), select.getTags());
        }
        return null;
    }

    private static JsonQuota mapQuota(Quota quota) {
        if(quota != null){
            JsonQuota jsonQuota = new JsonQuota();
            jsonQuota.setGalaxy(quota.getGalaxy() != null ? quota.getGalaxy().intValue() : null);
            jsonQuota.setMaxgalaxy(quota.getMaxgalaxy() != null ? quota.getMaxgalaxy().intValue() : null);
            jsonQuota.setCluster(quota.getCluster() != null ? quota.getCluster().intValue() : null);
            jsonQuota.setSector(quota.getSector() != null ? quota.getSector().intValue() : null);
            jsonQuota.setZone(quota.getZone() != null ? quota.getZone().intValue() : null);
            jsonQuota.setWing(quota.getWing() != null ? quota.getWing().intValue() : null);
            jsonQuota.setVariation(quota.getVariation() != null ? quota.getVariation().intValue() : null);
            jsonQuota.setStation(jsonQuota.getStation());
            return jsonQuota;
        }
        return null;
    }

    private static JsonOrder mapOrder(Orders orders) {
        if(orders != null){
            JsonOrder jsonOrder = new JsonOrder();
            Order order = orders.getOrder();
            jsonOrder.setOrder(order.getOrder());
            jsonOrder.setDefaultOrder(order.isDefault());
            for (Param param : order.getParam()) {
                jsonOrder.getParams().put(param.getName(), param.getValue());
            }
            return jsonOrder;
        }
        return null;
    }

    private static JsonModifiers mapModifiers(Modifiers modifiers) {
        if(modifiers != null){
            JsonModifiers jsonModifiers = new JsonModifiers();
            jsonModifiers.setCommandeerable(modifiers.isCommandeerable());
            jsonModifiers.setRebuild(modifiers.isRebuild());
            jsonModifiers.setSubordinate(modifiers.isSubordinate());
            return jsonModifiers;
        }
        return null;
    }

    private static JsonLocation mapLocation(Location location) {
        if(location != null){
            JsonLocation jsonLocation = new JsonLocation();
            jsonLocation.setClazz(location.getClazz());
            jsonLocation.setMacro(location.getMacro());
            jsonLocation.setComparison(location.getComparison());
            jsonLocation.setFaction(location.getFaction());
            jsonLocation.setFactionRace(location.getFactionrace());
            jsonLocation.setMatchExtension(location.isMatchextension());
            jsonLocation.setNegateFactionRace(location.isNegatefactionrace());
            jsonLocation.setPoliceFaction(location.getPolicefaction());
            jsonLocation.setRegionBasket(location.getRegionbasket());
            jsonLocation.setRelation(location.getRelation());
            Sunlight sunlight = location.getSunlight();
            jsonLocation.setSunlight(sunlight != null ? new JsonSunlight(sunlight.getMin().doubleValue(),
                    sunlight.getMax().doubleValue()) : null);
            return jsonLocation;
        }
        return null;
    }

    private static JsonEnvironment mapEnvironment(Environment environment) {
        if(environment != null){
            JsonEnvironment jsonEnvironment = new JsonEnvironment();
            jsonEnvironment.setBuildatshipyard(environment.isBuildatshipyard());
            jsonEnvironment.setGate(environment.isGate());
            return jsonEnvironment;
        }
        return null;
    }

    private static JsonCategory mapCategory(Category category) {
        if(category != null) {
            JsonCategory jsonCategory = new JsonCategory();
            jsonCategory.setFaction(category.getFaction());
            jsonCategory.setSize(category.getSize());
            jsonCategory.setTags(category.getTags());
            return jsonCategory;
        }
        return null;
    }
}
