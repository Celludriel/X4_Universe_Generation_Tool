<?xml version="1.0" encoding="utf-8"?>
<macros>
  <macro name="x3g_galaxy_macro" class="galaxy">
    <component ref="standardgalaxy" />
    <connections>
<#list 1..clusters as i>
      <connection name="x3g_cluster${i?left_pad(2, "0")}_connection" ref="clusters">
        <offset>
          <position x="0" y="0" z="0" />
        </offset>
        <macro ref="x3g_cluster${i?left_pad(2, "0")}_macro" connection="galaxy" />
      </connection>
</#list>
    </connections>
  </macro>
</macros>
