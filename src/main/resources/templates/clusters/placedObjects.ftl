<?xml version="1.0" encoding="utf-8"?>
<diff>
    <#if galaxy.containsClaimableShips()>
    <replace sel="//cue[@name='Place_Claimable_Ships']" >
    <cue name="Place_Claimable_Ships">
     <conditions>
        <event_cue_signalled/>
      </conditions>
      <actions>

        <set_value name="$debugchance" exact="0"/>

        <#list galaxy.spaceObjects as object>
        <#if object.type == "CLAIM">
        <find_sector name="$sector" macro="macro.${galaxy.galaxyPrefix}_cluster${object.clusterId}_sector001_macro"/>
        <do_if value="$sector.exists">
          <create_ship name="$ship" macro="macro.${object.shipMacro}" sector="$sector">
            <owner exact="faction.ownerless"/>
            <position x="${object.x}km" y="${object.z}km" z="${object.y}km"/>
            <rotation yaw="${object.yaw}deg" pitch="${object.pitch}deg" roll="${object.roll}deg"/>
          </create_ship>
        </do_if>
        </#if>
        </#list>

      </actions>
    </cue>
    </replace>
    </#if>
</diff>