<?xml version="1.0" encoding="utf-8"?>
<macros xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <#list galaxy.clusters as cl>
    <#list cl.zoneList as zone>
      <macro name="${galaxy.galaxyPrefix}_${zone.name}_sector001_macro" class="zone">
        <component ref="standardzone" />
        <connections>
          <#if zone.hasConnections?? >
            <#list zone.connections as zoneconnection>
          <connection name="${galaxy.galaxyPrefix}_gate_${zoneconnection.origin}_${zoneconnection.target}_connection" ref="gates">
            <offset>
              <position x="0" y="500" z="0" />
		      <rotation yaw="${zoneconnection.rotation}" pitch="0" roll="0" />
            </offset>
            <macro ref="props_gates_orb_accelerator_01_macro" connection="space" />
          </connection>
            </#list>
          </#if>
        </connections>
      </macro>
    </#list>
  </#list>
</macros>