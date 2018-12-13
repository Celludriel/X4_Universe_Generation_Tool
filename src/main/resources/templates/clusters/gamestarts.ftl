<?xml version="1.0" encoding="utf-8"?>
<gamestarts xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="gamestarts.xsd">
  <gamestart id="${galaxy.galaxyPrefix}_galaxy_main" name="${galaxy.gamestartName}" image="gamestart_1">
    <location galaxy="${galaxy.galaxyPrefix}_galaxy_macro" zone="${galaxy.galaxyPrefix}_${galaxy.starterZoneName}_sector001_macro">
      <position x="1000" y="0" z="1000"/>
      <rotation yaw="0" pitch="0" roll="0"/>
    </location>
    <player macro="character_player_fight_macro" money="5000" name="{1021,302}">
      <ship macro="ship_par_s_fighter_01_a_macro">
        <loadout>
          <macros>
            <engine macro="engine_par_s_combat_01_mk1_macro" path="../con_engine_01" />
            <engine macro="engine_par_s_combat_01_mk1_macro" path="../con_engine_02" />
            <engine macro="engine_par_s_combat_01_mk1_macro" path="../con_engine_03" />
            <weapon macro="weapon_gen_s_laser_01_mk1_macro" path="../con_weapon_01" optional="true" />
            <weapon macro="weapon_gen_s_guided_01_mk1_macro" path="../con_weapon_02" optional="true" />
            <shield macro="shield_par_s_standard_01_mk1_macro" path="../con_shield_01" optional="true" />
          </macros>
          <ammunition>
            <ammunition macro="missile_guided_light_mk1_macro" exact="10" optional="true" />
            <ammunition macro="eq_arg_satellite_01_macro" exact="5" optional="true"/>
            <ammunition macro="env_deco_nav_beacon_t1_macro" exact="5" optional="true"/>
            <ammunition macro="eq_arg_resourceprobe_01_macro" exact="5" optional="true"/>
          </ammunition>
          <software>
            <software ware="software_targetmk1" />
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
        <ware ware="module_par_pier_l_01" />
        <ware ware="module_par_stor_container_s_01" />
        <ware ware="module_par_conn_base_01" />
        <ware ware="module_par_conn_cross_01" />
        <ware ware="module_par_conn_vertical_01" />
        <ware ware="module_gen_prod_energycells_01" />
        <ware ware="module_par_prod_sojabeans_01" />
        <ware ware="paintmod_0006"/>
        <ware ware="paintmod_0048"/>
        <ware ware="paintmod_0049"/>
        <ware ware="paintmod_0050"/>
      </blueprints>
      <research>
        <ware ware="research_radioreceiver" />
        <ware ware="research_sensorbooster" />
        <ware ware="research_tradeinterface" />
      </research>
      <theme paint="painttheme_player_01" />
    </player>
  </gamestart>
</gamestarts>