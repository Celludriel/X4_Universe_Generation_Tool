<?xml version="1.0" encoding="utf-8"?>
<diff>
    <replace sel="//cue[@name='Manager']/conditions/check_value/@value">player.galaxy.macro == macro.${galaxy.galaxyPrefix}_galaxy_macro</replace>
    <remove sel="(//cue[@name='Manager']/actions/find_sector)[1]" />
    <remove sel="(//cue[@name='Manager']/actions/find_sector)[1]" />
    <remove sel="(//cue[@name='Manager']/actions/find_sector)[1]" />
    <remove sel="(//cue[@name='Manager']/actions/find_sector)[1]" />
    <remove sel="(//cue[@name='Manager']/actions/find_sector)[1]" />
    <remove sel="(//cue[@name='Manager']/actions/find_sector)[1]" />
    <remove sel="(//cue[@name='Manager']/actions/find_sector)[1]" />
    <remove sel="(//cue[@name='Manager']/actions/find_sector)[1]" />

    <#list galaxy.khaakClusters as cluster>
        <add sel="//cue[@name='Manager']/actions/set_value[@name='$HiveStationMaxCount']" pos="before">
            <find_sector groupname='$PotentialHiveStationSectors' macro='macro.${galaxy.galaxyPrefix}_cluster${cluster}_sector001_macro'/>
        </add>
    </#list>
</diff>