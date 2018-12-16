<?xml version="1.0" encoding="utf-8"?>
<diff>
    <replace sel="//cue[@name='FactionLogicManagers']/conditions/check_value/@value">player.galaxy.macro.ismacro.{macro.${galaxy.galaxyPrefix}_galaxy_macro}</replace>
    <#list galaxy.factionHqLocations as location>
    <#if location.faction == 'ARGON'>
    <replace sel="//cue[@name='FindFactionHeadquarters']/actions/do_if[@exact='faction.${location.faction.getName()}']/find_cluster/@macro">macro.${galaxy.galaxyPrefix}_cluster${location.clusterId}_macro</replace>
    <replace sel="//cue[@name='SetUpNewHeadquarters']/actions/do_if[@exact='faction.${location.faction.getName()}']/find_cluster/@macro">macro.${galaxy.galaxyPrefix}_cluster${location.clusterId}_macro</replace>
    <#elseif location.faction == 'HATIKVAH'>
    <replace sel="//cue[@name='FindFactionHeadquarters']/actions/do_elseif[@exact='faction.${location.faction.getName()}']/find_sector/@macro">macro.${galaxy.galaxyPrefix}_cluster${location.clusterId}_sector001_macro</replace>
    <replace sel="//cue[@name='SetUpNewHeadquarters']/actions/do_elseif[@exact='faction.${location.faction.getName()}']/find_sector/@macro">macro.${galaxy.galaxyPrefix}_cluster${location.clusterId}_sector001_macro</replace>
    <#else>
    <replace sel="//cue[@name='FindFactionHeadquarters']/actions/do_elseif[@exact='faction.${location.faction.getName()}']/find_cluster/@macro">macro.${galaxy.galaxyPrefix}_cluster${location.clusterId}_macro</replace>
    <replace sel="//cue[@name='SetUpNewHeadquarters']/actions/do_elseif[@exact='faction.${location.faction.getName()}']/find_cluster/@macro">macro.${galaxy.galaxyPrefix}_cluster${location.clusterId}_macro</replace>
    </#if>
    </#list>
</diff>