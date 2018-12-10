<?xml version="1.0" encoding="utf-8"?>
<macros xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <#list 1..clusters as i>
  <macro name="x3g_zone001_cluster${i?left_pad(2, "0")}_sector001_macro" class="zone">
    <component ref="standardzone" />
    <connections>
    </connections>
  </macro>
  <macro name="x3g_zone001_cluster${i?left_pad(2, "0")}_sector002_macro" class="zone">
    <component ref="standardzone" />
    <connections>
    </connections>
  </macro>
  <macro name="x3g_zone001_cluster${i?left_pad(2, "0")}_sector003_macro" class="zone">
    <component ref="standardzone" />
    <connections>
    </connections>
  </macro>
  </#list>
</macros>