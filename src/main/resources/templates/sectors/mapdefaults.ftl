<?xml version="1.0" encoding="utf-8"?>
<defaults xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="libraries.xsd">
<#list 1..clusters as i>
  <dataset macro="x3g_cluster${i?left_pad(2, "0")}_macro">
    <properties>
      <identification name="Cluster ${i?left_pad(2, "0")}" description="Cluster ${i?left_pad(2, "0")}" />
      <sounds>
        <music ref="music_cluster_14" />
      </sounds>
      <area sunlight="1" economy="0.75" security="0.75" />
    </properties>
  </dataset>
  <dataset macro="x3g_cluster${i?left_pad(2, "0")}_sector001_macro">
    <properties>
      <identification name="Cluster ${i?left_pad(2, "0")} Sector I" description="" />
    </properties>
  </dataset>   
  <dataset macro="x3g_cluster${i?left_pad(2, "0")}_sector002_macro">
    <properties>
      <identification name="Cluster ${i?left_pad(2, "0")} Sector II" description="" />
    </properties>
  </dataset>
  <dataset macro="x3g_cluster${i?left_pad(2, "0")}_sector003_macro">
    <properties>
      <identification name="Cluster ${i?left_pad(2, "0")} Sector III" description="" />
    </properties>
  </dataset>
</#list>
</defaults>