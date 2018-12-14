<?xml version="1.0" encoding="utf-8"?>
<!--Remove all loaded before really hard-->
<diff>
  <remove sel="/god/objects"/>
  <remove sel="/god/stations"/>
  <remove sel="/god/products"/>
  <add sel="/god">
    <objects></objects>
    <stations>
		<defaults>
		  <location newzonechance="0.25" coreboundaryzoneheight="40000">
			<corerange max="1.3"/>
		  </location>
		  <modules production="5" storage="10" />
		  <quota zone="3" />
		</defaults>
		<#assign count = 0>
		<#list galaxy.clusters as cl>
		    <#list cl.stations as station>
		    <#assign count = count + 1>
		<station id="station_${count}" race="${station.race.getName()}" owner="${station.owner.getName()}" type="factory">
		  <quotas>
			<quota galaxy="1" zone="1" />
		  </quotas>
		  <location class="zone" macro="${galaxy.galaxyPrefix}_zone001_cluster${cl.id}_sector001_macro">
			<corerange min="1.2" max="1.6" />
		  </location>
		  <station>
			<select faction="${station.faction.getName()}" tags="[${station.type.getName()}]" />
			<loadout>
			  <level exact="1.0" />
			</loadout>
		  </station>
		</station>
		    </#list>
		</#list>
    </stations>
    <products>
        <#list galaxy.products as product>
        <product id="${product.id}" ware="${product.ware}" owner="${product.owner.getName()}" type="factory">
          <quotas>
            <quota galaxy="${product.galaxyQuota}" <#if product.clusterQuota??>cluster="${product.clusterQuota}"</#if> <#if product.sectorQuota??>sector="${product.sectorQuota}"</#if> <#if product.zoneQuota??>zone="${product.zoneQuota}"</#if>/>
          </quotas>
          <#if !product.locationInfo.solitary>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[${product.locationInfo.factionPrint}]" relation="self" comparison="ge">
            <#if product.locationInfo.economyMax??>
            <economy max="${product.locationInfo.economyMax}" maxbound="${product.locationInfo.maxBound?c}" />
            </#if>
            <#if product.locationInfo.sunlightMin??>
            <sunlight min="${product.locationInfo.sunlightMin}" max="${product.locationInfo.sunlightMax}" />
            </#if>
            <#if product.locationInfo.wares?size != 0>
            <#list product.locationInfo.wares as ware>
            <region ware="${ware}" max="80000" />
            </#list>
            </#if>
            <#if product.locationInfo.securityMin??>
            <security min="${product.locationInfo.securityMin}" />
            </#if>
          </location>
          <#else>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[${product.locationInfo.factionPrint}]" solitary="true" />
          </#if>
          <module>
            <select ware="${product.ware}" race="${product.race.getName()}" faction="${product.owner.getName()}"/>
          </module>
        </product>
        </#list>
    </products>
  </add>
</diff>