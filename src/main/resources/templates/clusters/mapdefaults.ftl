<?xml version="1.0" encoding="utf-8"?>
<defaults xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="libraries.xsd">
<#list galaxy.clusters as cl>
  <dataset macro="${galaxy.galaxyPrefix}_cluster${cl.id}_macro">
    <properties>
      <identification name="${cl.name}" description="${cl.description}" />
      <sounds>
        <music ref="${cl.music}" />
      </sounds>
      <area sunlight="${cl.sunlight}" economy="${cl.economy}" security="${cl.security}" />
    </properties>
  </dataset>
  <dataset macro="${galaxy.galaxyPrefix}_cluster${cl.id}_sector001_macro">
    <properties>
      <identification name="${cl.name}" description="${cl.description}" />
    </properties>
  </dataset>
</#list>
</defaults>