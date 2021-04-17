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

    <replace sel="//cue[@name='Place_DataVaults']/actions" >
      <actions>
        <create_group groupname="$VaultsGroup"/>
        <create_group groupname="$UnlockedVaultsGroup"/>

        <!--data vaults-->
        <#list galaxy.dataVaults as datavault>
        <find_zone name="$zone" macro="macro.${galaxy.galaxyPrefix}_zone001_cluster${datavault.clusterId}_Sector001_macro"/>
        <do_if value="$zone.exists">
          <create_object name="$vault" groupname="$VaultsGroup" owner="faction.ownerless" macro="macro.landmarks_vault_01_macro" zone="$zone">
            <position x="${datavault.x?c}m" y="0m" z="${datavault.y?c}m"/>
          </create_object>
          <do_if value="$vault.exists">
            <find_signalleak_location name="$slot" container="$vault"/>
            <create_signal_leak name="$leak${datavault?index + 1}" type="signalleaktype.data" object="$vault" slot="$slot" macro="macro.dataleak_xs_vault_01_macro"/>
          </do_if>
        </do_if>
        </#list>
      </actions>

    </replace>
</diff>