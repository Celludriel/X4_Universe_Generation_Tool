<?xml version="1.0" encoding="utf-8"?>
<macros>
  <#list galaxy.clusters as cl>
  <macro name="${galaxy.galaxyPrefix}_cluster${cl.id}_sector001_macro" class="sector">
    <component ref="standardsector" />
    <connections>
        <#list cl.zoneList as zone>
          <connection name="${galaxy.galaxyPrefix}_${zone.name}_sector001_connection" ref="zones">
            <offset>
              <position x="${zone.x?c}" y="0" z="${zone.y?c}" />
            </offset>
            <macro ref="${galaxy.galaxyPrefix}_${zone.name}_sector001_macro" connection="sector" />
          </connection>
        </#list>
    </connections>
  </macro>
  </#list>
</macros>