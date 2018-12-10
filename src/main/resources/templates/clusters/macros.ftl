<?xml version="1.0" encoding="utf-8"?>
<index>
  <!-- x3 galaxy -->
  <entry name="x3g_galaxy_macro" value="extensions\x3galaxy\maps\x3galaxy\galaxy"/>
  <entry name="x3g_cluster*" value="extensions\x3galaxy\maps\x3galaxy\clusters"/>
<#list 1..clusters as i>
  <entry name="x3g_cluster${i?left_pad(2, "0")}_sector*" value="extensions\x3galaxy\maps\x3galaxy\sectors"/>
</#list>
  <entry name="x3g_zone*" value="extensions\x3galaxy\maps\x3galaxy\zones"/>
</index>