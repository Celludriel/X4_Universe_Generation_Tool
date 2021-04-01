<?xml version="1.0" encoding="utf-8"?>
<diff>
    <replace sel="//cue[@name='FactionLogicManagers']/conditions/check_value/@value">player.galaxy.macro.ismacro.{macro.${galaxy.galaxyPrefix}_galaxy_macro}</replace>
    <#list galaxy.factionHqLocations as location>

    <replace sel="//cue[@name='${location.faction.getManagerName()}FactionLogic_Manager']/param[@name='PreferredHQSpaceMacro']/@value">macro.${galaxy.galaxyPrefix}_cluster${location.clusterId}_macro</replace>
    <replace sel="//do_if[@value='$Faction == faction.${location.faction.getName()}']/set_value[@name='$PreferredHQSpaceMacro']/@exact">macro.${galaxy.galaxyPrefix}_cluster${location.clusterId}_macro</replace>

    </#list>
</diff>