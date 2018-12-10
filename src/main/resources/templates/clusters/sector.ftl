<?xml version="1.0" encoding="utf-8"?>
<macros>
  <#list 1..clusters as i>
  <macro name="x3g_cluster${i?left_pad(2, "0")}_sector001_macro" class="sector">
    <component ref="standardsector" />
    <connections>
      <connection name="x3g_zone001_cluster${i?left_pad(2, "0")}_sector001_connection" ref="zones">
        <offset>
          <position x="0" y="0" z="0" />
        </offset>
        <macro ref="x3g_zone001_cluster${i?left_pad(2, "0")}_sector001_macro" connection="sector" />
      </connection>
    </connections>
  </macro>
  </#list>
</macros>