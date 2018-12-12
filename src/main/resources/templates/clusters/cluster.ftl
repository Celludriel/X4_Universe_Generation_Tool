<?xml version="1.0" encoding="utf-8"?>
<macros>
  <#list galaxy.clusters as cl>
  <macro name="${galaxy.galaxyPrefix}_cluster${cl.id}_macro" class="cluster">
    <component ref="standardcluster" />
    <connections>
      <connection name="${galaxy.galaxyPrefix}_cluster${cl.id}_sector001_connection" ref="sectors">  
        <macro ref="${galaxy.galaxyPrefix}_cluster${cl.id}_sector001_macro" connection="cluster" />
      </connection>      
      <connection ref="content">
        <macro>
          <component connection="space" ref="${cl.backdrop}" />
        </macro>
      </connection>
    </connections>
  </macro>
  </#list>
</macros>
