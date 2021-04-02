<?xml version="1.0" encoding="utf-8"?>
<!--Remove all loaded before really hard-->
<diff>
  <replace sel="/jobs">
    <jobs>
      <#list galaxy.jobs as job>
      <job id="${job.id}"<#if job.name??> name="${job.name}"</#if><#if job.startActive??> startactive="${job.startActive?c}"</#if><#if job.disabled??> disabled="${job.disabled}"</#if><#if job.comment??> comment="${job.comment}"</#if><#if job.description??> description="${job.description}"</#if><#if job.fullname??> fullname="${job.fullname?c}"</#if><#if job.ignorecommanderwares??> ignorecommanderwares="${job.ignorecommanderwares?c}"</#if>>
        <#if job.basket??>
        <basket basket="${job.basket.basket}"<#if job.basket.comment??> comment="${job.basket.comment}"</#if>/>
        </#if>
        <#if job.category??>
        <category faction="${job.category.faction}" tags="[${job.category.tags}]"<#if job.category.size??> size="${job.category.size}"</#if><#if job.category.comment??> comment="${job.category.comment}"</#if>/>
        </#if>
        <orders>
        <#list job.orders as order>
            <order order="${order.order}" default="${order.defaultOrder?c}<#if order.comment??> comment="${order.comment}"</#if>">
            <#list order.params as key, value>
                <param name="${key}" value="${value}"/>
            </#list>
            </order>
        </#list>
        </orders>
        <tasks>
        <#list job.tasks as task>
            <task task="${task.task}"<#if task.entitytype??> entitytype="${task.comment}"</#if><#if task.comment??> comment="${task.comment}"</#if>>
            <#list task.params as key, value>
                <param name="${key}" value="${value}"/>
            </#list>
            </task>
        </#list>
        </tasks>
        <quotas>
        <#list job.quotas as quota>
            <quota <#if quota.galaxy?? && quota.galaxy != 0>galaxy="${quota.galaxy}"</#if><#if quota.maxgalaxy?? && quota.maxgalaxy != 0> maxgalaxy="${quota.maxgalaxy}"</#if><#if quota.cluster?? && quota.cluster != 0> cluster="${quota.cluster}"</#if><#if quota.sector?? && quota.sector != 0> sector="${quota.sector}"</#if><#if quota.zone?? && quota.zone != 0> zone="${quota.zone}"</#if><#if quota.wing?? && quota.wing != 0> wing="${quota.wing}"</#if><#if quota.variation?? && quota.variation != 0> variation="${quota.variation}"</#if><#if quota.station??> station="${quota.station}"</#if><#if quota.gamestart??> gamestart="${quota.gamestart}"</#if>/>
        </#list>
        </quotas>
        <#if job.location??>
        <location
            <#if job.location.clazz??>class="${job.location.clazz}"</#if>
            <#if job.location.macro??> macro="${job.location.macro}"</#if>
            <#if job.location.regionBasked??> regionbasket="${job.location.regionBasket}"</#if>
            <#if job.location.relation??> relation="${job.location.relation}"</#if>
            <#if job.location.comparison??> comparison="${job.location.comparison}"</#if>
            <#if job.location.factions?size != 0> faction="${job.location.getPrintFactions()}"</#if>
            <#if job.location.isNegateFaction()> negatefaction="true"</#if>
            <#if job.location.policeFactions?size != 0> policefaction="${job.location.getPrintPoliceFactions()}"</#if>
            <#if job.location.isNegatePoliceFaction()> negatepolicefaction="true"</#if>
            <#if job.location.factionRaces?size != 0> factionrace="${job.location.getPrintFactionRaces()}"</#if>
            <#if job.location.isNegateFactionRace()> negatefactionrace="true"</#if>
            <#if job.location.matchExtension??> matchextension="${job.location.matchExtension?c}"</#if>
        />
        </#if>


      </job>
      </#list>
    </jobs>
  </replace>
</diff>