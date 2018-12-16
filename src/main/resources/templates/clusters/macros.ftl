<?xml version="1.0" encoding="utf-8"?>
<index>
  <!-- ${galaxy.galaxyName} -->
  <entry name="${galaxy.galaxyPrefix}_galaxy_macro" value="extensions\${galaxy.galaxyName}\maps\${galaxy.galaxyName}\galaxy"/>
  <entry name="${galaxy.galaxyPrefix}_cluster*" value="extensions\${galaxy.galaxyName}\maps\${galaxy.galaxyName}\clusters"/>
<#list galaxy.clusters as cl>
  <entry name="${galaxy.galaxyPrefix}_cluster${cl.id}_sector*" value="extensions\${galaxy.galaxyName}\maps\${galaxy.galaxyName}\sectors"/>
</#list>
  <entry name="${galaxy.galaxyPrefix}_zone*" value="extensions\${galaxy.galaxyName}\maps\${galaxy.galaxyName}\zones"/>
</index>