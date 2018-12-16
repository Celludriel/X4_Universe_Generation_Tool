<?xml version="1.0" encoding="utf-8"?>
<macros>
  <#list galaxy.clusters as cl>
  <macro name="${galaxy.galaxyPrefix}_cluster${cl.id}_macro" class="cluster">
    <component ref="standardcluster" />
    <connections>
      <connection name="${galaxy.galaxyPrefix}_cluster${cl.id}_sector001_connection" ref="sectors">  
        <macro ref="${galaxy.galaxyPrefix}_cluster${cl.id}_sector001_macro" connection="cluster" />
      </connection>
      <#list cl.belts as belt>
      <connection name="${galaxy.galaxyPrefix}_cluster${cl.id}_region00${belt?index}_connection" ref="regions">
        <offset>
          <position x="${belt.x?c}" y="0" z="${belt.y?c}" />
		  <rotation yaw="${belt.rotation}" pitch="0" roll="0"/>
        </offset>
        <macro name="${galaxy.galaxyPrefix}_cluster${cl.id}_region00${belt?index}_macro">
          <component connection="cluster" ref="standardregion" />
          <properties>
            <region ref="${belt.type.getName()}" />
          </properties>
        </macro>
      </connection>
      </#list>
      <connection ref="content">
        <macro>
          <component connection="space" ref="${cl.backdrop}" />
        </macro>
      </connection>
    </connections>
  </macro>
  </#list>
</macros>
