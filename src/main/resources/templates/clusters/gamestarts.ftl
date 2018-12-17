<?xml version="1.0" encoding="utf-8"?>
<diff>
  <remove sel="/gamestarts"/>
  <add sel="/">
    <gamestarts xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="gamestarts.xsd">
      <#list galaxy.factionStarts as factionStart>
      <gamestart id="${galaxy.galaxyPrefix}_galaxy_main_${factionStart?index}" name="${factionStart.name}" description="${factionStart.description}" image="gamestart_1">
        <location galaxy="${galaxy.galaxyPrefix}_galaxy_macro" zone="${galaxy.galaxyPrefix}_zone001_cluster${factionStart.clusterId}_sector001_macro">
          <position x="1000" y="0" z="1000"/>
          <rotation yaw="0" pitch="0" roll="0"/>
        </location>
        <player macro="character_player_${factionStart.faction.getPlayerStartMacro()}_macro" money="10000" name="${factionStart.playerName}">
          <ship macro="ship_${factionStart.faction.getRaceAbbreviation()}_s_fighter_01_a_macro">
            <loadout>
              <macros>
                <engine macro="engine_${factionStart.faction.getRaceAbbreviation()}_s_allround_01_mk1_macro" path="../con_engine_01" />
                <weapon macro="weapon_gen_s_laser_01_mk1_macro" path="../con_weapon_01" optional="1" />
                <shield macro="shield_${factionStart.faction.getRaceAbbreviation()}_s_standard_01_mk1_macro" path="../con_shield_01" optional="1" />
              </macros>
              <ammunition>
                <ammunition macro="eq_arg_satellite_01_macro" exact="5" optional="true"/>
                <ammunition macro="env_deco_nav_beacon_t1_macro" exact="5" optional="true"/>
                <ammunition macro="eq_arg_resourceprobe_01_macro" exact="5" optional="true"/>
              </ammunition>
              <software>
                <software ware="software_targetmk1" />
                <software ware="software_scannerlongrangemk1" />
              </software>
              <virtualmacros>
                <thruster macro="thruster_gen_s_allround_01_mk1_macro" />
              </virtualmacros>
            </loadout>
          </ship>
          <inventory>
            <ware ware="weapon_gen_spacesuit_repairlaser_01_mk1" amount="1" />
            <ware ware="software_scannerobjectmk3" amount="1" />
          </inventory>
          <blueprints>
            <ware ware="clothingmod_0001" />
            <ware ware="clothingmod_0002" />
            <ware ware="module_arg_dock_m_01_lowtech" />
            <ware ware="module_${factionStart.faction.getRaceAbbreviation()}_pier_l_01" />
            <ware ware="module_${factionStart.faction.getRaceAbbreviation()}_stor_container_s_01" />
            <ware ware="module_${factionStart.faction.getRaceAbbreviation()}_conn_base_01" />
            <ware ware="module_${factionStart.faction.getRaceAbbreviation()}_conn_cross_01" />
            <ware ware="module_${factionStart.faction.getRaceAbbreviation()}_conn_vertical_01" />
            <ware ware="module_gen_prod_energycells_01" />
            <ware ware="module_gen_prod_water_01" />
            <ware ware="paintmod_0006"/>
            <ware ware="paintmod_0048"/>
            <ware ware="paintmod_0049"/>
            <ware ware="paintmod_0050"/>
          </blueprints>
            <research>
              <ware ware="research_radioreceiver"/>
              <ware ware="research_sensorbooster"/>
              <ware ware="research_tradeinterface"/>
              <ware ware="research_module_build"/>
              <ware ware="research_module_defence"/>
              <ware ware="research_module_dock"/>
              <ware ware="research_module_habitation"/>
              <ware ware="research_module_production"/>
              <ware ware="research_module_storage"/>
              <ware ware="research_module_venture"/>
              <ware ware="research_mod_engine_mk1"/>
              <ware ware="research_mod_engine_mk2"/>
              <ware ware="research_mod_engine_mk3"/>
              <ware ware="research_mod_shield_mk1"/>
              <ware ware="research_mod_shield_mk2"/>
              <ware ware="research_mod_shield_mk3"/>
              <ware ware="research_mod_ship_mk1"/>
              <ware ware="research_mod_ship_mk2"/>
              <ware ware="research_mod_ship_mk3"/>
              <ware ware="research_mod_weapon_mk1"/>
              <ware ware="research_mod_weapon_mk2"/>
              <ware ware="research_mod_weapon_mk3"/>
              <ware ware="research_teleportation"/>
              <ware ware="research_teleportation_range_01"/>
              <ware ware="research_teleportation_range_02"/>
              <ware ware="research_teleportation_range_03"/>
            </research>
          <theme paint="painttheme_player_01" />
        </player>
      </gamestart>
      </#list>
    </gamestarts>
  </add>
</diff>