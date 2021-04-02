<?xml version="1.0" encoding="utf-8"?>
<!--Remove all loaded before really hard-->
<diff>
  <replace sel="/jobs">
    <jobs>
      <#list galaxy.jobs as job>
      <job id="${job.id}"<#if job.name??> name="${job.name}"</#if><#if job.startActive??> startactive="${job.startActive?c}"</#if><#if job.disabled??> disabled="${job.disabled?c}"</#if><#if job.comment??> comment="${job.comment}"</#if><#if job.description??> description="${job.description}"</#if><#if job.ignorecommanderwares??> ignorecommanderwares="${job.ignorecommanderwares?c}"</#if>>
        <#if job.basket??>
        <basket basket="${job.basket}"/>
        </#if>
        <#if job.category??>
        <category faction="${job.category.faction}" tags="[${job.category.tags}]"<#if job.category.size??> size="${job.category.size}"</#if>/>
        </#if>
        <#if job.order??>
        <orders>
            <order order="${job.order.order}" default="${job.order.defaultOrder?c}">
            <#list job.order.params as key, value>
                <param name="${key}" value="${value}"/>
            </#list>
            </order>
        </orders>
        </#if>
        <#if job.task??>
        <task task="${job.task}" />
        </#if>
        <#if job.quota??>
        <quota <#if job.quota.galaxy?? && job.quota.galaxy != 0>galaxy="${job.quota.galaxy?c}"</#if><#if job.quota.maxgalaxy?? && job.quota.maxgalaxy != 0> maxgalaxy="${job.quota.maxgalaxy?c}"</#if><#if job.quota.cluster?? && job.quota.cluster != 0> cluster="${job.quota.cluster?c}"</#if><#if job.quota.sector?? && job.quota.sector != 0> sector="${job.quota.sector?c}"</#if><#if job.quota.zone?? && job.quota.zone != 0> zone="${job.quota.zone?c}"</#if><#if job.quota.wing?? && job.quota.wing != 0> wing="${job.quota.wing?c}"</#if><#if job.quota.variation?? && job.quota.variation != 0> variation="${job.quota.variation?c}"</#if><#if job.quota.station??> station="${job.quota.station}"</#if> />
        </#if>
        <#if job.location??>
        <location <#if job.location.clazz??>class="${job.location.clazz}"</#if><#if job.location.macro??> macro="${job.location.macro}"</#if><#if job.location.regionBasked??> regionbasket="${job.location.regionBasket}"</#if><#if job.location.relation??> relation="${job.location.relation}"</#if><#if job.location.comparison??> comparison="${job.location.comparison}"</#if><#if job.location.matchExtension??> matchextension="${job.location.matchExtension?c}"</#if><#if job.location.faction??> faction="${job.location.faction}"</#if><#if job.location.policeFaction??> policefaction="${job.location.policeFaction}"</#if><#if job.location.factionRace??> factionrace="${job.location.factionRace}"</#if><#if job.location.negateFactionRace??> negatefactionrace="${job.location.negateFactionRace?c}"</#if>/>
        </#if>
        <#if job.encounters??>
        <encounters id="${job.encounters}"/>
        </#if>
        <#if job.environment??>
        <environment buildatshipyard="${job.environment.buildatshipyard?c}"<#if job.environment.gate??> gate="${job.environment.gate?c}"</#if> />
        </#if>
        <#if job.modifiers??>
        <modifiers <#if job.modifiers.commandeerable??>commandeerable="${job.modifiers.commandeerable?c}"</#if><#if job.modifiers.rebuild??> rebuild="${job.modifiers.rebuild?c}"</#if><#if job.modifiers.subordinate??> subordinate="${job.modifiers.subordinate?c}"</#if>  />  
        </#if>
        <#if job.time??>
        <time <#if job.time.interval??>interval="${job.time.interval?c}"</#if><#if job.time.start??> start="${job.time.start?c}"</#if> />
        </#if>
        <#if job.expirationTime??>
        <expirationtime <#if job.expirationTime.min??>min="${job.expirationTime.min?c}"</#if><#if job.expirationTime.max??> max="${job.expirationTime.max?c}"</#if> />
        </#if>
        <#if job.subordinates??>
        <subordinates>
            <#list job.subordinates as subordinate>
                <subordinate job="${subordinate}" />
            </#list>
        </subordinates>
        </#if>
        <#if job.ship??>
        <ship>
          <#if job.ship.select??>
          <select <#if job.ship.select.faction??>faction="${job.ship.select.faction}"</#if><#if job.ship.select.tags??> tags="${job.ship.select.tags}"</#if><#if job.ship.select.size??> size="${job.ship.select.size}"</#if> />
          </#if>
          <#if job.ship.loadout??>
          <loadout>
            <#if job.ship.loadout.level??>
            <level <#if job.ship.loadout.level.min??>min="${job.ship.loadout.level.min?c}"</#if><#if job.ship.loadout.level.max??> max="${job.ship.loadout.level.max?c}"</#if><#if job.ship.loadout.level.exact??> exact="${job.ship.loadout.level.exact?c}"</#if> />
            </#if>
            <#if job.ship.loadout.exact??>
            <variation exact="${job.ship.loadout.exact?c}"/>
            </#if>
          </loadout>
          </#if>
          <#if job.ship.unit??>
          <units>
            <unit <#if job.ship.unit.category??>category="${job.ship.unit.category}"</#if><#if job.ship.unit.min??> min="${job.ship.unit.min?c}"</#if><#if job.ship.unit.max??> max="${job.ship.unit.max?c}"</#if> />
          </units>
          </#if>
          <#if job.ship.owner??>
          <owner <#if job.ship.owner.exact??>exact="${job.ship.owner.exact}"</#if> overridenpc="${job.ship.owner.overridenpc?c}" />
          </#if>
          <#if job.ship.cargo??>
          <cargo>
            <wares <#if job.ship.cargo.multiple??>exact="${job.ship.cargo.multiple?c}"</#if>>
              <#if job.ship.cargo.fillpercent??>
              <fillpercent <#if job.ship.cargo.fillpercent.min??>min="${job.ship.cargo.fillpercent.min?c}"</#if><#if job.ship.cargo.fillpercent.max??> max="${job.ship.cargo.fillpercent.max?c}"</#if><#if job.ship.cargo.fillpercent.profile??> profile="${job.ship.cargo.fillpercent.profile}"</#if>/>
              </#if>
            </wares>
          </cargo>
          </#if>
          <#if job.ship.pilot??>
          <pilot <#if job.ship.pilot.macro??>macro="${job.ship.pilot.macro}"</#if>>
            <#if job.ship.pilot.page??>
            <page <#if job.ship.pilot.page.comment??>comment="${job.ship.pilot.page.comment}"</#if><#if job.ship.pilot.page.exact??> exact="${job.ship.pilot.page.exact?c}"</#if>/>
            </#if>
          </pilot>
          </#if>
        </ship>  
        </#if>
        <#if job.masstraffic??>
          <masstraffic <#if job.masstraffic.ref??>ref="${job.masstraffic.ref}"</#if><#if job.masstraffic.relaunchdelay??> relaunchdelay="${job.masstraffic.relaunchdelay?c}"</#if><#if job.masstraffic.respawndelay??> respawndelay="${job.masstraffic.respawndelay?c}"</#if>>
            <#if job.masstraffic.owner??>
            <owner <#if job.masstraffic.owner.exact??>exact="${job.masstraffic.owner.exact}"</#if> overridenpc="${job.masstraffic.owner.overridenpc?c}" />
            </#if>
          </masstraffic>
        </#if>
      </job>
      </#list>
    </jobs>
  </replace>
</diff>