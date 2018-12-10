<?xml version="1.0" encoding="utf-8"?>
<macros>
  <#list 1..clusters as i>
  <macro name="x3g_cluster${i?left_pad(2, "0")}_macro" class="cluster">
    <component ref="standardcluster" />
    <connections>
      <connection name="x3g_cluster${i?left_pad(2, "0")}_sector001_connection" ref="sectors">  
        <macro ref="x3g_cluster${i?left_pad(2, "0")}_sector001_macro" connection="cluster" />
      </connection>      
      <connection ref="content">
        <macro>
          <component connection="space" ref="cluster_black_wlight" />
        </macro>
      </connection>
    </connections>
  </macro>
  </#list>
</macros>
