package be.celludriel.universegenerator.main;

import be.celludriel.universegenerator.model.jobs.Ammo;
import be.celludriel.universegenerator.model.jobs.Basket;
import be.celludriel.universegenerator.model.jobs.Cargo;
import be.celludriel.universegenerator.model.jobs.Category;
import be.celludriel.universegenerator.model.jobs.Commander;
import be.celludriel.universegenerator.model.jobs.Distance;
import be.celludriel.universegenerator.model.jobs.Drop;
import be.celludriel.universegenerator.model.jobs.Economy;
import be.celludriel.universegenerator.model.jobs.Environment;
import be.celludriel.universegenerator.model.jobs.EquipmentMods;
import be.celludriel.universegenerator.model.jobs.ExpirationTime;
import be.celludriel.universegenerator.model.jobs.Faction;
import be.celludriel.universegenerator.model.jobs.FactionLicence;
import be.celludriel.universegenerator.model.jobs.FactionRace;
import be.celludriel.universegenerator.model.jobs.Inventory;
import be.celludriel.universegenerator.model.jobs.Job;
import be.celludriel.universegenerator.model.jobs.JobOrder;
import be.celludriel.universegenerator.model.jobs.Loadout;
import be.celludriel.universegenerator.model.jobs.Location;
import be.celludriel.universegenerator.model.jobs.MassTraffic;
import be.celludriel.universegenerator.model.jobs.Modifiers;
import be.celludriel.universegenerator.model.jobs.Owner;
import be.celludriel.universegenerator.model.jobs.Page;
import be.celludriel.universegenerator.model.jobs.People;
import be.celludriel.universegenerator.model.jobs.Person;
import be.celludriel.universegenerator.model.jobs.PersonAttributes;
import be.celludriel.universegenerator.model.jobs.PoliceFaction;
import be.celludriel.universegenerator.model.jobs.Position;
import be.celludriel.universegenerator.model.jobs.Quota;
import be.celludriel.universegenerator.model.jobs.Security;
import be.celludriel.universegenerator.model.jobs.Select;
import be.celludriel.universegenerator.model.jobs.Shield;
import be.celludriel.universegenerator.model.jobs.Ship;
import be.celludriel.universegenerator.model.jobs.ShipCategory;
import be.celludriel.universegenerator.model.jobs.Skill;
import be.celludriel.universegenerator.model.jobs.Stock;
import be.celludriel.universegenerator.model.jobs.Subordinate;
import be.celludriel.universegenerator.model.jobs.Sunlight;
import be.celludriel.universegenerator.model.jobs.Time;
import be.celludriel.universegenerator.model.jobs.Unit;
import be.celludriel.universegenerator.model.jobs.ValueType;
import be.celludriel.universegenerator.model.jobs.Weapon;
import be.celludriel.universegenerator.model.xml.libraries.Basejobquota;
import be.celludriel.universegenerator.model.xml.libraries.Gamestartjobquota;
import be.celludriel.universegenerator.model.xml.libraries.Gamestartjobquotas;
import be.celludriel.universegenerator.model.xml.libraries.Joborder;
import be.celludriel.universegenerator.model.xml.libraries.Jobs;
import be.celludriel.universegenerator.model.xml.libraries.Positionrange;
import be.celludriel.universegenerator.model.xml.libraries.Selectrandom;
import be.celludriel.universegenerator.model.xml.libraries.Shipdbcategoryselect;
import be.celludriel.universegenerator.model.xml.libraries.Task;
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
        JAXBContext context = JAXBContext.newInstance(Jobs.class);
        Jobs jobs = (Jobs) context.createUnmarshaller()
                .unmarshal(new FileReader("C:\\workspaces\\X4_Universe_Generation_Tool\\input\\jobs\\jobs.xml"));

        List<Job> jsonJobList = loadJobList(jobs);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("c:\\temp\\jobs.json"), jsonJobList);
    }

    private static List<Job> loadJobList(Jobs jobs) {
        List<Job> jsonJobList = new ArrayList<>(jobs.getJob().size());
        for (Jobs.Job job : jobs.getJob()) {
            List<Object> basketOrCategoryOrOrder = job.getBasketOrCategoryOrOrder();

            Map<Class, Object> map = basketOrCategoryOrOrder.stream()
                    .collect(Collectors.toMap(Object::getClass, object -> object));

            Jobs.Job.Basket basket = (Jobs.Job.Basket) map.get(Jobs.Job.Basket.class);
            Jobs.Job.Category category = (Jobs.Job.Category) map.get(Jobs.Job.Category.class);
            Joborder joborder = (Joborder) map.get(Joborder.class);
            Jobs.Job.Orders orders = (Jobs.Job.Orders) map.get(Jobs.Job.Orders.class);
            Task task = (Task) map.get(Task.class);
            Jobs.Job.Tasks tasks = (Jobs.Job.Tasks) map.get(Jobs.Job.Tasks.class);
            Basejobquota basejobquota = (Basejobquota) map.get(Basejobquota.class);
            Gamestartjobquotas gamestartjobquotas = (Gamestartjobquotas) map.get(Gamestartjobquotas.class);
            Jobs.Job.Location location = (Jobs.Job.Location) map.get(Jobs.Job.Location.class);
            Jobs.Job.Commander commander = (Jobs.Job.Commander) map.get(Jobs.Job.Commander.class);
            Jobs.Job.Encounters encounters = (Jobs.Job.Encounters) map.get(Jobs.Job.Encounters.class);
            Jobs.Job.Environment environment = (Jobs.Job.Environment) map.get(Jobs.Job.Environment.class);
            Positionrange positionrange = (Positionrange) map.get(Positionrange.class);
            Jobs.Job.Modifiers modifiers = (Jobs.Job.Modifiers) map.get(Jobs.Job.Modifiers.class);
            Jobs.Job.Time time = (Jobs.Job.Time) map.get(Jobs.Job.Time.class);
            Jobs.Job.Expirationtime expirationtime = (Jobs.Job.Expirationtime) map.get(Jobs.Job.Expirationtime.class);

            Job jsonJob = new Job();

            jsonJob.setId(job.getId());
            jsonJob.setName(job.getName());
            jsonJob.setDescription(job.getDescription());
            jsonJob.setDisabled(job.getDisabled());
            jsonJob.setStartActive(job.isStartactive());
            jsonJob.setFullName(job.isFullname());
            jsonJob.setIgnoreCommanderWares(job.isIgnorecommanderwares());
            jsonJob.setComment(job.getComment());
            jsonJob.setEncounters(encounters != null ? encounters.getId() : null);

            if(commander != null){
                jsonJob.setCommander(new Commander(commander.getMacro(),
                        commander.getEntitytype() != null ? commander.getEntitytype().value() : null ));
            }

            if(time != null){
                jsonJob.setTime(new Time(time.getInterval(), time.getStart()));
            }

            if(expirationtime != null){
                jsonJob.setExpirationTime(new ExpirationTime(expirationtime.getMin(), expirationtime.getMax()));
            }

            addBasket(jsonJob, basket);
            addCategory(jsonJob, category);
            addOrders(jsonJob, joborder, orders);
            addTasks(jsonJob, task, tasks);
            addQuotas(jsonJob, basejobquota, gamestartjobquotas);
            addLocation(jsonJob, location);
            addEnvironment(jsonJob, environment);
            addAddPositionRange(jsonJob, positionrange);
            addModifiers(jsonJob, modifiers);
            addShip(jsonJob, job.getShip());
            addSubordinates(jsonJob, job.getSubordinates());
            addMassTraffic(jsonJob, job.getMasstraffic());

            jsonJobList.add(jsonJob);
        }
        return jsonJobList;
    }

    private static void addMassTraffic(Job jsonJob, Jobs.Job.Masstraffic masstraffic) {
        if(masstraffic != null){
            MassTraffic jsonMassTraffic = setupMassTraffic(masstraffic.getOwnerOrPilotOrLoadout());

            jsonMassTraffic.setRef(masstraffic.getRef());
            jsonMassTraffic.setMacro(masstraffic.getMacro());
            jsonMassTraffic.setCapturable(masstraffic.getCapturable());
            jsonMassTraffic.setGroup(masstraffic.getGroup());
            jsonMassTraffic.setSellable(masstraffic.getSellable());
            jsonMassTraffic.setComment(masstraffic.getComment());
            jsonMassTraffic.setRelaunchdelay(masstraffic.getRelaunchdelay());
            jsonMassTraffic.setRespawndelay(masstraffic.getRespawndelay());

            ShipCategory shipCategory = new ShipCategory();
            Shipdbcategoryselect select = masstraffic.getSelect();
            if(select != null) {
                shipCategory.setSize(select.getSize());
                shipCategory.setRequired(select.isRequired());
                shipCategory.setFaction(select.getFaction());
                shipCategory.setTags(select.getTags());
                shipCategory.setComment(select.getComment());
                jsonMassTraffic.setShipCategory(shipCategory);
            }

            jsonJob.setMasstraffic(jsonMassTraffic);
        }
    }

    private static void addSubordinates(Job jsonJob, Jobs.Job.Subordinates subordinates) {
        if(subordinates != null){
            for (Jobs.Job.Subordinates.Subordinate subordinate : subordinates.getSubordinate()) {
                jsonJob.getSubordinates().add(new Subordinate(subordinate.getJob(), subordinate.getRebuild()));
            }
        }
    }

    private static void addShip(Job jsonJob, Jobs.Job.Ship ship) {
        if(ship != null){
            List<Object> ownerOrPilotOrLoadout = ship.getOwnerOrPilotOrLoadout();
            Ship jsonShip = new Ship();

            jsonShip.setRef(ship.getRef());
            jsonShip.setMacro(ship.getMacro());
            jsonShip.setCapturable(ship.getCapturable());
            jsonShip.setGroup(ship.getGroup());
            jsonShip.setSellable(ship.getSellable());
            jsonShip.setComment(ship.getComment());

            ShipCategory shipCategory = new ShipCategory();
            Shipdbcategoryselect select = ship.getSelect();
            if(select != null) {
                shipCategory.setSize(select.getSize());
                shipCategory.setRequired(select.isRequired());
                shipCategory.setFaction(select.getFaction());
                shipCategory.setTags(select.getTags());
                shipCategory.setComment(select.getComment());
                jsonShip.setShipCategory(shipCategory);
            }

            MassTraffic jsonMassTraffic = setupMassTraffic(ownerOrPilotOrLoadout);

            jsonShip.setMasstrafic(jsonMassTraffic);

            jsonJob.setShip(jsonShip);
        }
    }

    private static MassTraffic setupMassTraffic(List<Object> ownerOrPilotOrLoadout) {
        Map<Class, Object> map = ownerOrPilotOrLoadout.stream()
                .collect(Collectors.toMap(Object::getClass, object -> object));
        Jobs.Job.Masstraffic.Owner owner = (Jobs.Job.Masstraffic.Owner) map.get(Jobs.Job.Masstraffic.Owner.class);
        Jobs.Job.Masstraffic.Pilot pilot = (Jobs.Job.Masstraffic.Pilot) map.get(Jobs.Job.Masstraffic.Pilot.class);
        Jobs.Job.Masstraffic.Loadout loadOut = (Jobs.Job.Masstraffic.Loadout)
                map.get(Jobs.Job.Masstraffic.Loadout.class);
        Jobs.Job.Masstraffic.Equipmentmods equipmentMods = (Jobs.Job.Masstraffic.Equipmentmods)
                map.get(Jobs.Job.Masstraffic.Equipmentmods.class);
        Jobs.Job.Masstraffic.Paint paint = (Jobs.Job.Masstraffic.Paint) map.get(Jobs.Job.Masstraffic.Paint.class);
        Jobs.Job.Masstraffic.Basket basket = (Jobs.Job.Masstraffic.Basket)
                map.get(Jobs.Job.Masstraffic.Basket.class);
        Jobs.Job.Masstraffic.Ammo ammo = (Jobs.Job.Masstraffic.Ammo) map.get(Jobs.Job.Masstraffic.Ammo.class);
        Jobs.Job.Masstraffic.Cargo cargo = (Jobs.Job.Masstraffic.Cargo) map.get(Jobs.Job.Masstraffic.Cargo.class);
        Jobs.Job.Masstraffic.Inventory inventory = (Jobs.Job.Masstraffic.Inventory)
                map.get(Jobs.Job.Masstraffic.Inventory.class);
        Jobs.Job.Masstraffic.Drop drop = (Jobs.Job.Masstraffic.Drop) map.get(Jobs.Job.Masstraffic.Drop.class);
        Jobs.Job.Masstraffic.Units units = (Jobs.Job.Masstraffic.Units) map.get(Jobs.Job.Masstraffic.Units.class);
        Jobs.Job.Masstraffic.People people = (Jobs.Job.Masstraffic.People)
                map.get(Jobs.Job.Masstraffic.People.class);

        MassTraffic jsonMassTraffic = new MassTraffic();
        jsonMassTraffic.setPilot(pilot != null ? setupPerson(pilot.getNameOrOwnerOrPage()) : null);
        jsonMassTraffic.setPaint(paint != null ? paint.getWare() : null);
        jsonMassTraffic.setBasket(basket != null ? new Basket(basket.getBasket(), basket.getComment()) : null);
        jsonMassTraffic.setDrop(drop != null ? new Drop(drop.getRef(), drop.getComment()) : null);

        addOwnerToMassTraffic(owner, jsonMassTraffic);
        addLoadOutToMassTraffic(loadOut, jsonMassTraffic);
        addEquipmentModsToMassTraffic(equipmentMods, jsonMassTraffic);
        addAmmoToMassTraffic(ammo, jsonMassTraffic);
        addCargoToMassTraffic(cargo, jsonMassTraffic);
        addInventoryToMassTraffic(inventory, jsonMassTraffic);
        addUnitsToMassTraffic(units, jsonMassTraffic);
        addPeopleToMassTraffic(people, jsonMassTraffic);
        return jsonMassTraffic;
    }

    private static void addPeopleToMassTraffic(Jobs.Job.Masstraffic.People people, MassTraffic jsonMassTraffic) {
        if(people != null){
            People jsonPeople = new People();

            jsonPeople.setRef(people.getRef());

            Jobs.Job.Masstraffic.People.Fillpercent fillpercent = people.getFillpercent();
            if(fillpercent != null){
                ValueType jsonFillPercent = new ValueType();
                jsonFillPercent.setList(fillpercent.getList());
                jsonFillPercent.setMin(fillpercent.getMin());
                jsonFillPercent.setMax(fillpercent.getMax());
                jsonFillPercent.setScale(fillpercent.getScale() != null ? fillpercent.getScale().intValue() : null);
                jsonFillPercent.setExact(fillpercent.getExact());
                jsonFillPercent.setSeed(fillpercent.getSeed());
                jsonPeople.setFillPercent(jsonFillPercent);
            }

            for (Jobs.Job.Masstraffic.People.Person person : people.getPerson()) {
                Person jsonPerson = new Person();

                jsonPerson.setPerson(setupPerson(person.getNameOrOwnerOrPage()));
                jsonPerson.setComment(person.getComment());
                jsonPerson.setGroup(person.getGroup());
                jsonPerson.setRef(person.getRef());
                jsonPerson.setWeight(person.getWeight());
                jsonPerson.setActor(person.getActor());
                jsonPerson.setRole(person.getRole() != null ? person.getRole().value() : null);
                jsonPerson.setMacro(person.getMacro());

                jsonPeople.getPeople().add(jsonPerson);
            }

            jsonMassTraffic.setPeople(jsonPeople);
        }
    }

    private static void addUnitsToMassTraffic(Jobs.Job.Masstraffic.Units units, MassTraffic jsonMassTraffic) {
        if(units != null){
            for (Jobs.Job.Masstraffic.Units.Unit unit : units.getUnit()) {
                Unit jsonUnit = new Unit();

                jsonUnit.setCategory(unit.getCategory());
                jsonUnit.setTags(unit.getTags());
                jsonUnit.setMk(unit.getMk());

                ValueType jsonUnitValue = new ValueType();
                jsonUnitValue.setList(unit.getList());
                jsonUnitValue.setMin(unit.getMin());
                jsonUnitValue.setMax(unit.getMax());
                jsonUnitValue.setScale(unit.getScale() != null ? unit.getScale().intValue() : null);
                jsonUnitValue.setExact(unit.getExact());
                jsonUnitValue.setSeed(unit.getSeed());
                jsonUnit.setValue(jsonUnitValue);

                jsonMassTraffic.getUnits().add(jsonUnit);
            }
        }
    }

    private static void addInventoryToMassTraffic(Jobs.Job.Masstraffic.Inventory inventory, MassTraffic jsonMassTraffic) {
        if(inventory != null){
            for (Jobs.Job.Masstraffic.Inventory.Wares ware : inventory.getWares()) {
                Inventory jsonInventory = new Inventory();

                jsonInventory.setBasket(ware.getBasket());
                jsonInventory.setChance(ware.getChance());
                jsonInventory.setList(ware.getList());
                jsonInventory.setMultiple(ware.isMultiple());

                Jobs.Job.Masstraffic.Inventory.Wares.Fillvalue fillvalue = ware.getFillvalue();
                if(fillvalue != null){
                    ValueType jsonFillValue = new ValueType();
                    jsonFillValue.setList(fillvalue.getList());
                    jsonFillValue.setMin(fillvalue.getMin());
                    jsonFillValue.setMax(fillvalue.getMax());
                    jsonFillValue.setScale(fillvalue.getScale() != null ? fillvalue.getScale().intValue() : null);
                    jsonFillValue.setExact(fillvalue.getExact());
                    jsonFillValue.setSeed(fillvalue.getSeed());
                    jsonInventory.setFillValue(jsonFillValue);
                }

                Jobs.Job.Masstraffic.Inventory.Wares.Fillamount fillAmount = ware.getFillamount();
                if(fillAmount != null){
                    ValueType jsonFillPercent = new ValueType();
                    jsonFillPercent.setList(fillAmount.getList());
                    jsonFillPercent.setMin(fillAmount.getMin());
                    jsonFillPercent.setMax(fillAmount.getMax());
                    jsonFillPercent.setScale(fillAmount.getScale() != null ? fillAmount.getScale().intValue() : null);
                    jsonFillPercent.setExact(fillAmount.getExact());
                    jsonFillPercent.setSeed(fillAmount.getSeed());
                    jsonInventory.setFillAmount(jsonFillPercent);
                }

                jsonMassTraffic.getInventory().add(jsonInventory);
            }
        }
    }

    private static void addCargoToMassTraffic(Jobs.Job.Masstraffic.Cargo cargo, MassTraffic jsonMassTraffic) {
        if(cargo != null){
            for (Jobs.Job.Masstraffic.Cargo.Wares ware : cargo.getWares()) {
                Cargo jsonCargo = new Cargo();

                jsonCargo.setBasket(ware.getBasket());
                jsonCargo.setChance(ware.getChance());
                jsonCargo.setList(ware.getList());
                jsonCargo.setMultiple(ware.isMultiple());
                jsonCargo.setOnjobrespawn(ware.isOnjobrespawn());

                Jobs.Job.Masstraffic.Cargo.Wares.Fillvalue fillvalue = ware.getFillvalue();
                if(fillvalue != null){
                    ValueType jsonFillValue = new ValueType();
                    jsonFillValue.setList(fillvalue.getList());
                    jsonFillValue.setMin(fillvalue.getMin());
                    jsonFillValue.setMax(fillvalue.getMax());
                    jsonFillValue.setScale(fillvalue.getScale() != null ? fillvalue.getScale().intValue() : null);
                    jsonFillValue.setExact(fillvalue.getExact());
                    jsonFillValue.setSeed(fillvalue.getSeed());
                    jsonCargo.setFillValue(jsonFillValue);
                }

                Jobs.Job.Masstraffic.Cargo.Wares.Fillpercent fillpercent = ware.getFillpercent();
                if(fillpercent != null){
                    ValueType jsonFillPercent = new ValueType();
                    jsonFillPercent.setList(fillpercent.getList());
                    jsonFillPercent.setMin(fillpercent.getMin());
                    jsonFillPercent.setMax(fillpercent.getMax());
                    jsonFillPercent.setScale(fillpercent.getScale() != null ? fillpercent.getScale().intValue() : null);
                    jsonFillPercent.setExact(fillpercent.getExact());
                    jsonFillPercent.setSeed(fillpercent.getSeed());
                    jsonCargo.setFillPercent(jsonFillPercent);
                }

                jsonMassTraffic.getCargo().add(jsonCargo);
            }
        }
    }

    private static void addAmmoToMassTraffic(Jobs.Job.Masstraffic.Ammo ammo, MassTraffic jsonMassTraffic) {
        if(ammo != null){
            for (Jobs.Job.Masstraffic.Ammo.Macro ammoElement : ammo.getMacro()) {
                Ammo jsonAmmo = new Ammo();
                jsonAmmo.setRef(ammoElement.getRef());
                jsonAmmo.setValue(jsonAmmo.getValue());

                Jobs.Job.Masstraffic.Ammo.Macro.Fillamount fillAmount = ammoElement.getFillamount();
                if(fillAmount != null){
                    ValueType jsonFillAmount = new ValueType();
                    jsonFillAmount.setList(fillAmount.getList());
                    jsonFillAmount.setMin(fillAmount.getMin());
                    jsonFillAmount.setMax(fillAmount.getMax());
                    jsonFillAmount.setScale(fillAmount.getScale() != null ? fillAmount.getScale().intValue() : null);
                    jsonFillAmount.setExact(fillAmount.getExact());
                    jsonFillAmount.setSeed(fillAmount.getSeed());
                    jsonAmmo.setFillAmount(jsonFillAmount);
                }

                Jobs.Job.Masstraffic.Ammo.Macro.Fillpercent fillpercent = ammoElement.getFillpercent();
                if(fillpercent != null){
                    ValueType jsonFillPercent = new ValueType();
                    jsonFillPercent.setList(fillpercent.getList());
                    jsonFillPercent.setMin(fillpercent.getMin());
                    jsonFillPercent.setMax(fillpercent.getMax());
                    jsonFillPercent.setScale(fillpercent.getScale() != null ? fillpercent.getScale().intValue() : null);
                    jsonFillPercent.setExact(fillpercent.getExact());
                    jsonFillPercent.setSeed(fillpercent.getSeed());
                    jsonAmmo.setFillPercent(jsonFillPercent);
                }

                jsonMassTraffic.getAmmo().add(jsonAmmo);
            }
        }

    }

    private static void addEquipmentModsToMassTraffic(Jobs.Job.Masstraffic.Equipmentmods equipmentMods,
                                                      MassTraffic jsonMassTraffic) {
        if(equipmentMods != null){
            EquipmentMods jsonEquipmentMods = new EquipmentMods();
            jsonEquipmentMods.setMods(equipmentMods.getMods() != null ? equipmentMods.getMods().getList() : null);
            jsonEquipmentMods.setEngine(equipmentMods.getEngine() != null ? equipmentMods.getEngine().getWare() : null);
            jsonEquipmentMods.setShip(equipmentMods.getShip() != null ? equipmentMods.getShip().getWare() : null);

            List<Jobs.Job.Masstraffic.Equipmentmods.Weapon> weapons = equipmentMods.getWeapon();
            if(weapons != null){
                for (Jobs.Job.Masstraffic.Equipmentmods.Weapon weapon : weapons) {
                    Weapon jsonWeapon = new Weapon();
                    jsonWeapon.setContext(weapon.getContext());
                    jsonWeapon.setGroup(weapon.getGroup());
                    jsonWeapon.setMacro(weapon.getMacro());
                    jsonWeapon.setWare(weapon.getWare());
                    jsonEquipmentMods.getWeapons().add(jsonWeapon);
                }
            }

            List<Jobs.Job.Masstraffic.Equipmentmods.Shield> shields = equipmentMods.getShield();
            if(weapons != null){
                for (Jobs.Job.Masstraffic.Equipmentmods.Shield shield : shields) {
                    Shield jsonShield = new Shield();
                    jsonShield.setContext(shield.getContext());
                    jsonShield.setGroup(shield.getGroup());
                    jsonShield.setWare(shield.getWare());
                    jsonEquipmentMods.getShields().add(jsonShield);
                }
            }

            jsonMassTraffic.setEquipmentMods(jsonEquipmentMods);
        }
    }

    private static void addLoadOutToMassTraffic(Jobs.Job.Masstraffic.Loadout loadOut, MassTraffic jsonMassTraffic) {
        if(loadOut != null) {
            Loadout jsonLoadout = new Loadout();
            jsonLoadout.setRef(loadOut.getRef());
            jsonLoadout.setLoadout(loadOut.getLoadout());

            Jobs.Job.Masstraffic.Loadout.Level level = loadOut.getLevel();
            if(level != null){
                ValueType jsonLevel = new ValueType();
                jsonLevel.setList(level.getList());
                jsonLevel.setMin(level.getMin());
                jsonLevel.setMax(level.getMax());
                jsonLevel.setScale(level.getScale() != null ? level.getScale().intValue() : null);
                jsonLevel.setExact(level.getExact());
                jsonLevel.setSeed(level.getSeed());
                jsonLoadout.setLevel(jsonLevel);
            }

            Jobs.Job.Masstraffic.Loadout.Variation variation = loadOut.getVariation();
            if(variation != null){
                ValueType jsonVariation = new ValueType();
                jsonVariation.setList(variation.getList());
                jsonVariation.setMin(variation.getMin());
                jsonVariation.setMax(variation.getMax());
                jsonVariation.setScale(variation.getScale() != null ? variation.getScale().intValue() : null);
                jsonVariation.setExact(variation.getExact());
                jsonVariation.setSeed(variation.getSeed());
                jsonLoadout.setLevel(jsonVariation);
            }

            jsonMassTraffic.setLoadout(jsonLoadout);
        }
    }

    private static void addPilotToMassTraffic(Jobs.Job.Masstraffic.Pilot pilot, MassTraffic jsonMassTraffic) {
        if(pilot != null){
            jsonMassTraffic.setPilot(setupPerson(pilot.getNameOrOwnerOrPage()));
        }
    }

    private static PersonAttributes setupPerson(List<Object> nameOrOwnerOrPage) {
        Map<Class, Object> map = nameOrOwnerOrPage.stream()
                .collect(Collectors.toMap(Object::getClass, object -> object));

        Jobs.Job.Masstraffic.People.Person.Name name = (Jobs.Job.Masstraffic.People.Person.Name)
                map.get(Jobs.Job.Masstraffic.People.Person.Name.class);
        Selectrandom owner = (Selectrandom) map.get(Selectrandom.class);
        Jobs.Job.Masstraffic.People.Person.Page page = (Jobs.Job.Masstraffic.People.Person.Page)
                map.get(Jobs.Job.Masstraffic.People.Person.Page.class);
        Jobs.Job.Masstraffic.People.Person.Skills skills = (Jobs.Job.Masstraffic.People.Person.Skills)
                map.get(Jobs.Job.Masstraffic.People.Person.Skills.class);
        Jobs.Job.Masstraffic.People.Person.Stock stock = (Jobs.Job.Masstraffic.People.Person.Stock)
                map.get(Jobs.Job.Masstraffic.People.Person.Stock.class);
        Jobs.Job.Masstraffic.People.Person.Clothing clothing = (Jobs.Job.Masstraffic.People.Person.Clothing)
                map.get(Jobs.Job.Masstraffic.People.Person.Clothing.class);

        PersonAttributes pilotPerson = new PersonAttributes();

        pilotPerson.setName(name != null ? name.getName() : null);

        if(owner != null){
            Owner pilotOwner = new Owner();
            pilotOwner.setSelection(owner.getSelection() != null ? owner.getSelection().value() : null);
            pilotOwner.setComment(owner.getComment());
            ValueType value = new ValueType();
            value.setList(owner.getList());
            value.setMin(owner.getMin());
            value.setMax(owner.getMax());
            value.setScale(owner.getScale() != null ? owner.getScale().intValue() : null);
            value.setExact(owner.getExact());
            value.setSeed(owner.getSeed());
            pilotOwner.setValue(value);

            List<Selectrandom.Select> select = owner.getSelect();
            if(select != null) {
                ArrayList<Select> jsonSelections = new ArrayList<>();
                for (Selectrandom.Select randomSelect : select) {
                    Select jsonSelect = new Select();
                    jsonSelect.setWeight(randomSelect.getWeight() != null ? randomSelect.getWeight().intValue() : null);
                    jsonSelect.setComment(randomSelect.getComment());
                    ValueType jsonSelectValue = new ValueType();
                    jsonSelectValue.setList(randomSelect.getList());
                    jsonSelectValue.setMin(randomSelect.getMin());
                    jsonSelectValue.setMax(randomSelect.getMax());
                    jsonSelectValue.setScale(randomSelect.getScale() != null ? randomSelect.getScale().intValue() : null);
                    jsonSelectValue.setExact(randomSelect.getExact());
                    jsonSelectValue.setSeed(randomSelect.getSeed());
                    jsonSelect.setValue(jsonSelectValue);
                    jsonSelections.add(jsonSelect);
                }
                pilotOwner.setSelect(jsonSelections);
            }
            pilotPerson.setOwner(pilotOwner);
        }

        if(clothing != null) {
            pilotPerson.setClothing(clothing.getWare());
        }

        if(stock != null) {
            pilotPerson.setStock(new Stock(stock.getRef(), stock.getComment()));
        }

        if(page != null){
            Page jsonPage = new Page();
            jsonPage.setTags(page.getTags());
            jsonPage.setComment(page.getComment());
            ValueType pageValueType = new ValueType();
            pageValueType.setList(page.getList());
            pageValueType.setMin(page.getMin());
            pageValueType.setMax(page.getMax());
            pageValueType.setScale(page.getScale() != null ? page.getScale().intValue() : null);
            pageValueType.setExact(page.getExact());
            pageValueType.setSeed(page.getSeed());
            jsonPage.setValue(pageValueType);
            pilotPerson.setPage(jsonPage);
        }

        if(skills != null){
            ArrayList<Skill> jsonSkills = new ArrayList<>();
            for (Jobs.Job.Masstraffic.People.Person.Skills.Skill skill : skills.getSkill()) {
                Skill jsonSkill = new Skill();
                jsonSkill.setType(skill.getType() != null ? skill.getType().value() : null);
                jsonSkill.setComment(skill.getComment());
                ValueType skillValueType = new ValueType();
                skillValueType.setList(page.getList());
                skillValueType.setMin(page.getMin());
                skillValueType.setMax(page.getMax());
                skillValueType.setScale(page.getScale() != null ? page.getScale().intValue() : null);
                skillValueType.setExact(page.getExact());
                skillValueType.setSeed(page.getSeed());
                jsonSkill.setValue(skillValueType);
                jsonSkills.add(jsonSkill);
            }
            pilotPerson.setSkills(jsonSkills);
        }
        return pilotPerson;
    }

    private static void addOwnerToMassTraffic(Jobs.Job.Masstraffic.Owner owner, MassTraffic jsonMassTraffic) {
        if(owner != null){
            Owner jsonOwner = new Owner();

            ArrayList<Select> jsonOwnerSelections = new ArrayList<>();
            List<Selectrandom.Select> ownerSelections = owner.getSelect();
            if(ownerSelections != null){
                for (Selectrandom.Select ownerSelection : ownerSelections) {
                    Select ownerSelect = new Select();
                    ownerSelect.setWeight(ownerSelection.getWeight() != null ? ownerSelection.getWeight().intValue() :
                            null);
                    ownerSelect.setComment(ownerSelection.getComment());

                    ValueType value = new ValueType();
                    value.setList(ownerSelection.getList());
                    value.setExact(ownerSelection.getExact());
                    value.setMin(ownerSelection.getMin());
                    value.setMax(ownerSelection.getMax());
                    value.setProfile(ownerSelection.getProfile() != null ? ownerSelection.getProfile().value() :
                            null);
                    value.setScale(ownerSelection.getScale() != null ? ownerSelection.getScale().intValue() : null);
                    value.setSeed(ownerSelection.getSeed());
                    ownerSelect.setValue(value);

                    jsonOwnerSelections.add(ownerSelect);
                }
                jsonOwner.setSelect(jsonOwnerSelections);
            }

            jsonOwner.setSelection(owner.getSelection() != null ? owner.getSelection().value() : null);
            jsonOwner.setOverridenpc(owner.getOverridenpc());
            jsonOwner.setComment(owner.getComment());
            ValueType ownerValue = new ValueType();
            ownerValue.setList(owner.getList());
            ownerValue.setExact(owner.getExact());
            ownerValue.setMin(owner.getMin());
            ownerValue.setMax(owner.getMax());
            ownerValue.setProfile(owner.getProfile() != null ? owner.getProfile().value() :
                    null);
            ownerValue.setScale(owner.getScale() != null ? owner.getScale().intValue() : null);
            ownerValue.setSeed(owner.getSeed());
            jsonOwner.setValue(ownerValue);


            jsonMassTraffic.setOwner(jsonOwner);
        }
    }

    private static void addModifiers(Job jsonJob, Jobs.Job.Modifiers modifiers) {
        if(modifiers != null){
            Modifiers jsonModifier = new Modifiers();
            jsonModifier.setInvincible(modifiers.isInvincible());
            jsonModifier.setRebuild(modifiers.isRebuild());
            jsonModifier.setCommandeerable(modifiers.isCommandeerable());
            jsonModifier.setSubordinate(modifiers.isSubordinate());
            jsonJob.setModifiers(jsonModifier);
        }

    }

    private static void addAddPositionRange(Job jsonJob, Positionrange positionrange) {
        if(positionrange != null){
            Position position = new Position();
            Positionrange.Distance distance = positionrange.getDistance();
            if(distance != null){
                position.setDistance(new Distance(distance.getExact(), distance.getMin(), distance.getMax()));
            }
            position.setPitch(positionrange.getPitch());
            position.setRoll(positionrange.getRoll());
            position.setYaw(positionrange.getYaw());
            position.setX(positionrange.getX());
            position.setY(positionrange.getY());
            position.setZ(positionrange.getZ());
            position.setSafepos(positionrange.isSafepos());
            jsonJob.setPosition(position);
        }
    }

    private static void addEnvironment(Job jsonJob, Jobs.Job.Environment environment) {
        if(environment != null) {
            Environment jsonEnvironment = new Environment();

            jsonEnvironment.setChancedocked(environment.getChancedocked());
            jsonEnvironment.setBuildatshipyard(environment.isBuildatshipyard());
            jsonEnvironment.setGate(environment.isGate());
            jsonEnvironment.setSpawninsector(environment.isSpawninsector());
            jsonEnvironment.setZone(environment.isZone());
            jsonEnvironment.setSpwanoutofsector(environment.isSpwanoutofsector());

            jsonJob.setEnvironment(jsonEnvironment);
        }
    }

    private static void addLocation(Job jsonJob, Jobs.Job.Location location) {
        if(location != null){
            Location jsonLocation = new Location();

            Jobs.Job.Location.Economy economy = location.getEconomy();
            Jobs.Job.Location.Security security = location.getSecurity();
            Jobs.Job.Location.Sunlight sunlight = location.getSunlight();
            if(economy != null){
                jsonLocation.setEconomy(new Economy(economy.getMin(), economy.getMax()));
            }
            if(security != null){
                jsonLocation.setSecurity(new Security(security.getMin(), security.getMax()));
            }
            if(sunlight != null) {
                jsonLocation.setSunlight(new Sunlight(sunlight.getMin(), sunlight.getMax()));
            }

            ArrayList<Faction> jsonFactions = new ArrayList<>();
            if(location.getFaction() != null){
                jsonFactions.add(new Faction(location.getFaction(), null));
            }

            if(location.getFactions() != null && location.getFactions().getFaction() != null){
                for (Jobs.Job.Location.Factions.Faction faction : location.getFactions().getFaction()) {
                    jsonFactions.add(new Faction(faction.getFaction(), faction.isNegatefaction()));
                }
            }
            jsonLocation.setFactions(jsonFactions);

            ArrayList<PoliceFaction> jsonPoliceFactions = new ArrayList<>();
            if(location.getPolicefaction() != null){
                jsonPoliceFactions.add(new PoliceFaction(location.getPolicefaction(), null));
            }

            if(location.getPoliceFactionValue() != null && location.getPoliceFactionValue().getPolicefaction() != null) {
                for (Jobs.Job.Location.Policefaction.PolicefactionElement policefactionElement :
                        location.getPoliceFactionValue().getPolicefaction()) {
                    jsonPoliceFactions.add(new PoliceFaction(policefactionElement.getPolicefaction(),
                            policefactionElement.isNegatepolicefaction()));
                }
            }
            jsonLocation.setPoliceFactions(jsonPoliceFactions);

            ArrayList<FactionRace> jsonFactionRaces = new ArrayList<>();
            if(location.getFactionrace() != null){
                jsonFactionRaces.add(new FactionRace(location.getFactionrace(), null));
            }

            if(location.getFactionraces() != null && location.getFactionraces().getFactionrace() != null){
                for (Jobs.Job.Location.Factionraces.Factionrace factionrace :
                        location.getFactionraces().getFactionrace()) {
                    jsonFactionRaces.add(new FactionRace(factionrace.getFactionrace(),
                            factionrace.isNegatefactionrace()));
                }
            }
            jsonLocation.setFactionRaces(jsonFactionRaces);

            ArrayList<FactionLicence> jsonFactionLicences = new ArrayList<>();
            if(location.getFactionlicences() != null){
                for (Jobs.Job.Location.Factionlicences.Factionlicence factionLicence : location.getFactionlicences()
                        .getFactionlicence()) {
                    jsonFactionLicences.add(new FactionLicence(factionLicence.getFaction(),
                            factionLicence.getLicence(), factionLicence.isNegatefactionlicence()));

                }
            }
            jsonLocation.setFactionLicences(jsonFactionLicences);

            jsonLocation.setMacro(location.getMacro());
            jsonLocation.setClazz(location.getClazz());
            jsonLocation.setRegionBasket(location.getRegionbasket());
            jsonLocation.setRelation(location.getRelation() != null ? location.getRelation().value() : null);
            jsonLocation.setComparison(location.getComparison() != null ? location.getComparison().value() : null);
            jsonLocation.setMatchExtension(location.isMatchextension());

            jsonJob.setLocation(jsonLocation);
        }
    }

    private static void addQuotas(Job jsonJob, Basejobquota basejobquota, Gamestartjobquotas gamestartjobquotas) {
        ArrayList<Quota> jsonQuotas = new ArrayList<>();

        if(basejobquota != null) {
            Quota jsonQuota = new Quota();
            jsonQuota.setGalaxy(basejobquota.getGalaxy() != null ? basejobquota.getGalaxy().intValue() : null);
            jsonQuota.setCluster(basejobquota.getCluster() != null ? basejobquota.getCluster().intValue() : null);
            jsonQuota.setSector(basejobquota.getSector() != null ? basejobquota.getSector().intValue() : null);
            jsonQuota.setZone(basejobquota.getZone() != null ? basejobquota.getZone().intValue() : null);
            jsonQuota.setWing(basejobquota.getWing() != null ? basejobquota.getWing().intValue() : null);
            jsonQuota.setMaxgalaxy(basejobquota.getMaxgalaxy() != null ? basejobquota.getMaxgalaxy().intValue() : null);
            jsonQuota.setVariation(basejobquota.getVariation() != null ? basejobquota.getVariation().intValue() : null);
            jsonQuota.setStation(basejobquota.getStation());
            jsonQuotas.add(jsonQuota);
        }

        if(gamestartjobquotas != null && gamestartjobquotas.getQuota() != null){
            for (Gamestartjobquota gamestartjobquota : gamestartjobquotas.getQuota()) {
                Quota jsonQuota = new Quota();
                jsonQuota.setGalaxy(gamestartjobquota.getGalaxy() != null ? gamestartjobquota.getGalaxy().intValue() : null);
                jsonQuota.setCluster(gamestartjobquota.getCluster() != null ? gamestartjobquota.getCluster().intValue() : null);
                jsonQuota.setSector(gamestartjobquota.getSector() != null ? gamestartjobquota.getSector().intValue() : null);
                jsonQuota.setZone(gamestartjobquota.getZone() != null ? gamestartjobquota.getSector().intValue() : null);
                jsonQuota.setWing(gamestartjobquota.getWing() != null ? gamestartjobquota.getWing().intValue() : null);
                jsonQuota.setMaxgalaxy(gamestartjobquota.getMaxgalaxy() != null ? gamestartjobquota.getMaxgalaxy().intValue() : null);
                jsonQuota.setVariation(gamestartjobquota.getVariation() != null ? gamestartjobquota.getVariation().intValue() : null);
                jsonQuota.setStation(gamestartjobquota.getStation());
                jsonQuota.setStation(gamestartjobquota.getGamestart());
                jsonQuotas.add(jsonQuota);
            }
        }

        jsonJob.setQuotas(jsonQuotas);
    }

    private static void addTasks(Job jsonJob, Task task, Jobs.Job.Tasks tasks) {
        ArrayList<be.celludriel.universegenerator.model.jobs.Task> jsonTasks = new ArrayList<>();

        if(task != null){
            jsonTasks.add(createJsonTask(task));
        }

        if(tasks != null && tasks.getTask() != null){
            for (Task listTask : tasks.getTask()) {
                jsonTasks.add(createJsonTask(listTask));
            }
        }

        jsonJob.setTasks(jsonTasks);
    }

    private static be.celludriel.universegenerator.model.jobs.Task createJsonTask(Task task) {
        be.celludriel.universegenerator.model.jobs.Task jsonTask =
                new be.celludriel.universegenerator.model.jobs.Task();
        jsonTask.setTask(task.getTask());
        jsonTask.setEntitytype(task.getEntitytype() != null ? task.getEntitytype().value() : null);
        jsonTask.setComment(task.getComment());
        List<Task.Param> paramList = task.getParam();
        if(paramList != null){
            jsonTask.setParams(paramList.stream()
                    .collect(Collectors.toMap(Task.Param::getName, param -> param.getValue())));
        }
        return jsonTask;
    }

    private static void addOrders(Job jsonJob, Joborder joborder, Jobs.Job.Orders orders) {
        ArrayList<JobOrder> jsonOrders = new ArrayList<>();
        if (joborder != null) {
            jsonOrders.add(createJsonJobOrder(joborder));
        }

        if(orders != null && orders.getOrder() != null) {
            for (Joborder listJobOrder : orders.getOrder()) {
                jsonOrders.add(createJsonJobOrder(listJobOrder));
            }
        }

        jsonJob.setOrders(jsonOrders);
    }

    private static JobOrder createJsonJobOrder(Joborder joborder) {
        JobOrder jsonJobOrder = new JobOrder();
        jsonJobOrder.setOrder(joborder.getOrder());
        jsonJobOrder.setDefaultOrder(joborder.isDefault());
        jsonJobOrder.setComment(joborder.getComment());
        List<Joborder.Param> paramList = joborder.getParam();
        if(paramList != null) {
            jsonJobOrder.setParams(paramList.stream()
                    .collect(Collectors.toMap(Joborder.Param::getName, param -> param.getValue())));
        }
        return jsonJobOrder;
    }

    private static void addCategory(Job jsonJob, Jobs.Job.Category category) {
        if (category != null) {
            Category jsonCategory = new Category();

            jsonCategory.setFaction(category.getFaction());
            jsonCategory.setSize(category.getSize());
            jsonCategory.setTags(category.getTags());
            jsonCategory.setComment(category.getComment());

            jsonJob.setCategory(jsonCategory);
        }
    }

    private static void addBasket(Job jsonJob, Jobs.Job.Basket basket) {
        if (basket != null) {
            Basket jsonBasket = new Basket();

            jsonBasket.setBasket(basket.getBasket());
            jsonBasket.setComment(basket.getComment());

            jsonJob.setBasket(jsonBasket);
        }
    }
}
