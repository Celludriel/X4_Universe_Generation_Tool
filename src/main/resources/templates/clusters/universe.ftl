<?xml version="1.0" encoding="utf-8"?>
<macros>
  <macro name="${galaxy.galaxyPrefix}_galaxy_macro" class="galaxy">
    <component ref="standardgalaxy" />
    <connections>
<#list galaxy.clusters as cl>
      <!-- cluster setup ${cl.id} -->
      <connection name="${galaxy.galaxyPrefix}_cluster${cl.id}_connection" ref="clusters">
        <offset>
          <position x="${cl.clusterX}" y="0" z="${cl.clusterZ}" />
        </offset>
        <macro ref="${galaxy.galaxyPrefix}_cluster${cl.id}_macro" connection="galaxy" />
      </connection>
          <!-- gate connection setup ${cl.id} -->
      <#list cl.zoneList as zone>
        <#list zone.connections as zoneconnection>
          <#if !zoneconnection.reverseConnection >
          <connection name="${galaxy.galaxyPrefix}_gate_${zoneconnection.origin}_${zoneconnection.target}" ref="destination" path="../${galaxy.galaxyPrefix}_cluster${cl.id}_connection/${galaxy.galaxyPrefix}_cluster${cl.id}_sector001_connection/${galaxy.galaxyPrefix}_${zone.name}_sector001_connection/${galaxy.galaxyPrefix}_gate_${zoneconnection.origin}_${zoneconnection.target}_connection">
            <macro connection="destination" path="../../../../../${galaxy.galaxyPrefix}_cluster${zoneconnection.targetZoneId}_connection/${galaxy.galaxyPrefix}_cluster${zoneconnection.targetZoneId}_sector001_connection/${galaxy.galaxyPrefix}_${zoneconnection.targetZoneName}_sector001_connection/${galaxy.galaxyPrefix}_gate_${zoneconnection.target}_${zoneconnection.origin}_connection" />
          </connection>
          </#if>
        </#list>
      </#list>
</#list>

    </connections>
  </macro>
</macros>
