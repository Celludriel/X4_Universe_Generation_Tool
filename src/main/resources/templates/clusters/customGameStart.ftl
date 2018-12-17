<?xml version="1.0" encoding="utf-8"?>
<mdscript name="custom_gamestart" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="md.xsd">
  <cues>
    <cue name="ExecuteCustomGameStart">
      <conditions>
        <event_cue_signalled cue="md.Setup.GameStart" />
      </conditions>
      <actions>
		<set_value name="player.entity.$x4ep1_hq_research_unlocked"/>
        <set_value name="$Unlocked" exact="[ware.mod_engine_boostduration_01_mk1,
              ware.mod_engine_boostthrust_01_mk1,
              ware.mod_engine_boostthrust_02_mk1,
              ware.mod_engine_forwardthrust_01_mk1,
              ware.mod_engine_forwardthrust_02_mk1,
              ware.mod_engine_rotationthrust_02_mk1,
              ware.mod_engine_strafethrust_01_mk1,
              ware.mod_engine_strafethrust_02_mk1,
              ware.mod_engine_travelattacktime_01_mk1,
              ware.mod_engine_travelchargetime_01_mk1,
              ware.mod_engine_travelreleasetime_01_mk1,
              ware.mod_engine_travelstartthrust_01_mk1,
              ware.mod_engine_travelthrust_01_mk1,
              ware.mod_engine_travelthrust_02_mk1,
			  ware.mod_engine_boostthrust_01_mk2,
              ware.mod_engine_boostthrust_02_mk2,
              ware.mod_engine_forwardthrust_01_mk2,
              ware.mod_engine_forwardthrust_02_mk2,
              ware.mod_engine_travelthrust_01_mk2,
              ware.mod_engine_travelthrust_02_mk2,
			  ware.mod_engine_boostthrust_01_mk3,
              ware.mod_engine_forwardthrust_01_mk3,
              ware.mod_engine_rotationthrust_01_mk3,
              ware.mod_engine_travelthrust_01_mk3,
			  ware.mod_shield_capacity_01_mk1,
              ware.mod_shield_rechargedelay_01_mk1,
              ware.mod_shield_rechargerate_01_mk1,
			  ware.mod_shield_capacity_01_mk2,
              ware.mod_shield_rechargerate_01_mk2,
			  ware.mod_shield_capacity_01_mk3,
              ware.mod_shield_capacity_02_mk3,
              ware.mod_shield_rechargerate_01_mk3,
			  ware.mod_weapon_beamlength_01_mk1,
              ware.mod_weapon_chargetime_01_mk1,
              ware.mod_weapon_cooling_01_mk1,
              ware.mod_weapon_cooling_02_mk1,
              ware.mod_weapon_cooling_03_mk1,
              ware.mod_weapon_damage_01_mk1,
              ware.mod_weapon_damage_02_mk1,
              ware.mod_weapon_damage_03_mk1,
              ware.mod_weapon_lifetime_01_mk1,
              ware.mod_weapon_mining_01_mk1,
              ware.mod_weapon_reload_01_mk1,
              ware.mod_weapon_rotationspeed_01_mk1,
              ware.mod_weapon_speed_01_mk1,
              ware.mod_weapon_sticktime_01_mk1,
			  ware.mod_weapon_cooling_01_mk2,
              ware.mod_weapon_cooling_02_mk2,
              ware.mod_weapon_cooling_03_mk2,
              ware.mod_weapon_cooling_04_mk2,
              ware.mod_weapon_cooling_05_mk2,
              ware.mod_weapon_damage_01_mk2,
              ware.mod_weapon_damage_02_mk2,
              ware.mod_weapon_damage_03_mk2,
              ware.mod_weapon_damage_04_mk2,
              ware.mod_weapon_damage_05_mk2,
              ware.mod_weapon_sticktime_01_mk2,
              ware.mod_weapon_sticktime_02_mk2,
              ware.mod_weapon_sticktime_03_mk2,
			  ware.mod_weapon_damage_01_mk3,
              ware.mod_weapon_damage_02_mk3,
              ware.mod_weapon_mining_01_mk3,
              ware.mod_weapon_speed_01_mk3,
			  ware.mod_ship_countermeasurecapacity_01_mk1,
              ware.mod_ship_deployablecapacity_01_mk1,
              ware.mod_ship_drag_01_mk1,
              ware.mod_ship_mass_01_mk1,
              ware.mod_ship_maxhull_01_mk1,
              ware.mod_ship_missilecapacity_01_mk1,
              ware.mod_ship_radarrange_01_mk1,
              ware.mod_ship_unitcapacity_01_mk1,
			  ware.mod_ship_drag_01_mk2,
              ware.mod_ship_mass_01_mk2,
			  ware.mod_ship_mass_01_mk3]"/>

		<do_all exact="$Unlocked.count" counter="$i">
			<add_encyclopedia_entry item="$Unlocked.{$i}.id" type="equipmentmods"/>
			<add_blueprints wares="$Unlocked.{$i}"/>
		</do_all>
      </actions>
    </cue>
  </cues>
</mdscript>
