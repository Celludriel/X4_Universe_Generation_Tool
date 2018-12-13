<?xml version="1.0" encoding="utf-8"?>
<!--Remove all loaded before really hard-->
<diff>
  <remove sel="/god/objects"/>
  <remove sel="/god/stations"/>
  <remove sel="/god/products"/>
  <add sel="/god">
    <objects></objects>
    <stations>
		<defaults>
		  <location newzonechance="0.25" coreboundaryzoneheight="40000">
			<corerange max="1.3"/>
		  </location>
		  <modules production="5" storage="10" />
		  <quota zone="3" />
		</defaults>
		<#assign count = 0>
		<#list galaxy.clusters as cl>
		    <#list cl.stations as station>
		    <#assign count = count + 1>
		<station id="station_${count}" race="${station.race.getName()}" owner="${station.owner.getName()}" type="factory">
		  <quotas>
			<quota galaxy="1" zone="1" />
		  </quotas>
		  <location class="zone" macro="${galaxy.galaxyPrefix}_zone001_cluster${cl.id}_sector001_macro">
			<corerange min="1.2" max="1.6" />
		  </location>
		  <station>
			<select faction="${station.faction.getName()}" tags="[${station.type.getName()}]" />
			<loadout>
			  <level exact="1.0" />
			</loadout>
		  </station>
		</station>
		    </#list>
		</#list>
    </stations>
    <products>
        <!-- Argon Economy -->
        <product id="arg_advancedcomposites" ware="advancedcomposites" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="advancedcomposites" race="argon" faction="argon"/>
          </module>
        </product>
        
        <product id="arg_advancedelectronics" ware="advancedelectronics" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="advancedelectronics" race="argon"/>
          </module>
        </product>
        
        <product id="arg_antimattercells" ware="antimattercells" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <region ware="hydrogen" max="80000" />
          </location>
          <module>
            <select ware="antimattercells" race="argon"/>
          </module>
        </product>
        
        <product id="arg_antimatterconverters" ware="antimatterconverters" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="antimatterconverters" race="argon"/>
          </module>
        </product>
        
        <product id="arg_claytronics" ware="claytronics" owner="argon" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="claytronics" race="argon" />
          </module>
        </product>
        
        <product id="arg_dronecomponents" ware="dronecomponents" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="dronecomponents" race="argon"/>
          </module>
        </product>
        
        <product id="arg_energycells" ware="energycells" owner="argon" type="factory">
          <quotas>
            <quota galaxy="10" sector="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.6" maxbound="false" />
            <sunlight min="1" max="3" />
          </location>
          <module>
            <select ware="energycells" race="argon"/>
          </module>
        </product>
        
        <product id="arg_engineparts" ware="engineparts" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="engineparts" race="argon"/>
          </module>
        </product>
        
        <product id="arg_fieldcoils" ware="fieldcoils" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="fieldcoils" race="argon"/>
          </module>
        </product>
        
        <product id="arg_foodrations" ware="foodrations" owner="argon" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="foodrations" race="argon"/>
          </module>
        </product>
        
        <product id="arg_graphene" ware="graphene" owner="argon" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <region ware="methane" max="80000" />
          </location>
          <module>
            <select ware="graphene" race="argon"/>
          </module>
        </product>
        
        <product id="arg_hullparts" ware="hullparts" owner="argon" type="factory">
          <quotas>
            <quota galaxy="16" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="hullparts" race="argon"/>
          </module>
        </product>
        
        <product id="arg_meat" ware="meat" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="meat" race="argon"/>
          </module>
        </product>
        
        <product id="arg_medicalsupplies" ware="medicalsupplies" owner="argon" type="factory">
          <quotas>
            <quota galaxy="18" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="medicalsupplies" race="argon"/>
          </module>
        </product>
        
        <product id="arg_microchips" ware="microchips" owner="argon" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="microchips" race="argon"/>
          </module>
        </product>
        
        <product id="arg_missilecomponents" ware="missilecomponents" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="missilecomponents" race="argon"/>
          </module>
        </product>
        
        <product id="arg_plasmaconductors" ware="plasmaconductors" owner="argon" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="plasmaconductors" race="argon"/>
          </module>
        </product>
        
        <product id="arg_quantumtubes" ware="quantumtubes" owner="argon" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="quantumtubes" race="argon"/>
          </module>
        </product>
        
        <product id="arg_refinedmetals" ware="refinedmetals" owner="argon" type="factory">
          <quotas>
            <quota galaxy="6" sector="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <region ware="ore" max="80000" />
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="refinedmetals" race="argon"/>
          </module>
        </product>
        
        <product id="arg_scanningarrays" ware="scanningarrays" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="scanningarrays" race="argon"/>
          </module>
        </product>
        
        <product id="arg_shieldcomponents" ware="shieldcomponents" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="shieldcomponents" race="argon"/>
          </module>
        </product>
        
        <product id="arg_siliconwafers" ware="siliconwafers" owner="argon" type="factory">
          <quotas>
            <quota galaxy="6" sector="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <region ware="silicon" max="80000"/>
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="siliconwafers" race="argon"/>
          </module>
        </product>
        
        <product id="arg_smartchips" ware="smartchips" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="smartchips" race="argon"/>
          </module>
        </product>
        
        <product id="arg_spacefuel" ware="spacefuel" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[antigone, hatikvah]" relation="self" comparison="ge" solitary="true" excluderinghighway="true">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="spacefuel" race="argon"/>
          </module>
        </product>
        
        <product id="pir_spacefuel" ware="spacefuel" owner="hatikvah" type="factory">
          <quotas>
            <quota galaxy="12" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[ownerless]" solitary="true" />
          <module>
            <select ware="spacefuel" race="argon"/>
          </module>
        </product>
        
        <product id="arg_spices" ware="spices" owner="argon" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="spices" race="argon"/>
          </module>
        </product>
        
        <product id="arg_superfluidcoolant" ware="superfluidcoolant" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <region ware="helium" max="80000" />
          </location>
          <module>
            <select ware="superfluidcoolant" race="argon"/>
          </module>
        </product>
        
        <product id="arg_turretcomponents" ware="turretcomponents" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="turretcomponents" race="argon"/>
          </module>
        </product>
        
        <product id="arg_water" ware="water" owner="argon" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <region ware="ice" max="80000" />
          </location>
          <module>
            <select ware="water" race="argon"/>
          </module>
        </product>
        
        <product id="arg_weaponcomponents" ware="weaponcomponents" owner="argon" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="weaponcomponents" race="argon"/>
          </module>
        </product>
        
        <product id="arg_wheat" ware="wheat" owner="argon" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[argon, hatikvah]" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="wheat" race="argon"/>
          </module>
        </product>
        
        <!-- Antigone Economy -->
        <product id="ant_advancedcomposites" ware="advancedcomposites" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="advancedcomposites" race="argon" faction="argon"/>
          </module>
        </product>
        
        <product id="ant_advancedelectronics" ware="advancedelectronics" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="advancedelectronics" race="argon"/>
          </module>
        </product>
        
        <product id="ant_antimatterconverters" ware="antimatterconverters" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="antimatterconverters" race="argon"/>
          </module>
        </product>
        
        <product id="ant_claytronics" ware="claytronics" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="claytronics" race="argon" />
          </module>
        </product>
        
        <product id="ant_energycells" ware="energycells" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="8" sector="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.6" maxbound="false" />
            <sunlight min="1" max="3" />
          </location>
          <module>
            <select ware="energycells" race="argon"/>
          </module>
        </product>
        
        <product id="ant_engineparts" ware="engineparts" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="engineparts" race="argon"/>
          </module>
        </product>
        
        
        <product id="ant_foodrations" ware="foodrations" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="foodrations" race="argon"/>
          </module>
        </product>
        
        <product id="ant_graphene" ware="graphene" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <region ware="methane" max="80000" />
          </location>
          <module>
            <select ware="graphene" race="argon"/>
          </module>
        </product>
        
        <product id="ant_hullparts" ware="hullparts" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="12" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="hullparts" race="argon"/>
          </module>
        </product>
        
        <product id="ant_meat" ware="meat" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="meat" race="argon"/>
          </module>
        </product>
        
        <product id="ant_medicalsupplies" ware="medicalsupplies" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="16" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="medicalsupplies" race="argon"/>
          </module>
        </product>
        
        <product id="ant_microchips" ware="microchips" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="microchips" race="argon"/>
          </module>
        </product>
        
        <product id="ant_missilecomponents" ware="missilecomponents" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="missilecomponents" race="argon"/>
          </module>
        </product>
        
        <product id="ant_plasmaconductors" ware="plasmaconductors" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="plasmaconductors" race="argon"/>
          </module>
        </product>
        
        <product id="ant_quantumtubes" ware="quantumtubes" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="quantumtubes" race="argon"/>
          </module>
        </product>
        
        <product id="ant_refinedmetals" ware="refinedmetals" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="6" sector="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <region ware="ore" max="80000" />
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="refinedmetals" race="argon"/>
          </module>
        </product>
        
        <product id="ant_scanningarrays" ware="scanningarrays" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="scanningarrays" race="argon"/>
          </module>
        </product>
        
        <product id="ant_siliconwafers" ware="siliconwafers" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="4" sector="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <region ware="silicon" max="80000"/>
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="siliconwafers" race="argon"/>
          </module>
        </product>
        
        <product id="ant_smartchips" ware="smartchips" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="smartchips" race="argon"/>
          </module>
        </product>
        
        <product id="ant_spacefuel" ware="spacefuel" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[antigone, hatikvah]" relation="self" comparison="ge" solitary="true" excluderinghighway="true">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="spacefuel" race="argon"/>
          </module>
        </product>
        
        <product id="ant_spices" ware="spices" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="spices" race="argon"/>
          </module>
        </product>
        
        <product id="ant_superfluidcoolant" ware="superfluidcoolant" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <region ware="helium" max="80000" />
          </location>
          <module>
            <select ware="superfluidcoolant" race="argon"/>
          </module>
        </product>
        
        <product id="ant_turretcomponents" ware="turretcomponents" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="turretcomponents" race="argon"/>
          </module>
        </product>
        
        <product id="ant_water" ware="water" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <region ware="ice" max="80000" />
          </location>
          <module>
            <select ware="water" race="argon"/>
          </module>
        </product>
        
        <product id="ant_weaponcomponents" ware="weaponcomponents" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="weaponcomponents" race="argon"/>
          </module>
        </product>
        
        <product id="ant_wheat" ware="wheat" owner="antigone" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="antigone" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="wheat" race="argon"/>
          </module>
        </product>
        
        <!-- Paranid Economy -->
        <product id="par_advancedcomposites" ware="advancedcomposites" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="advancedcomposites" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_advancedcomposites" ware="advancedcomposites" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="advancedcomposites" race="paranid"/>
          </module>
        </product>
        
        <product id="par_advancedelectronics" ware="advancedelectronics" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="advancedelectronics" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_advancedelectronics" ware="advancedelectronics" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="advancedelectronics" race="paranid"/>
          </module>
        </product>
        
        <product id="par_antimattercells" ware="antimattercells" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" >
            <region ware="hydrogen" max="80000" />
          </location>
          <module>
            <select ware="antimattercells" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_antimattercells" ware="antimattercells" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" >
            <region ware="hydrogen" max="80000" />
          </location>
          <module>
            <select ware="antimattercells" race="paranid"/>
          </module>
        </product>
        
        <product id="par_antimatterconverters" ware="antimatterconverters" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="antimatterconverters" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_antimatterconverters" ware="antimatterconverters" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="antimatterconverters" race="paranid"/>
          </module>
        </product>
        
        <product id="par_claytronics" ware="claytronics" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="claytronics" race="paranid" />
          </module>
        </product>
        
        <product id="hol_claytronics" ware="claytronics" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="claytronics" race="paranid" />
          </module>
        </product>
        
        <product id="par_dronecomponents" ware="dronecomponents" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="dronecomponents" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_dronecomponents" ware="dronecomponents" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="dronecomponents" race="paranid"/>
          </module>
        </product>
        
        <product id="par_energycells" ware="energycells" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="10" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge">
            <sunlight min="1" max="3" />
          </location>
          <module>
            <select ware="energycells" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_energycells" ware="energycells" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="10" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge">
            <sunlight min="1" max="3" />
          </location>
          <module>
            <select ware="energycells" race="paranid"/>
          </module>
        </product>
        
        <product id="par_engineparts" ware="engineparts" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="engineparts" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_engineparts" ware="engineparts" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="engineparts" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_fieldcoils" ware="fieldcoils" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="fieldcoils" race="paranid"/>
          </module>
        </product>
        
        <product id="par_graphene" ware="graphene" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge">
            <region ware="methane" max="80000" />
          </location>
          <module>
            <select ware="graphene" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_graphene" ware="graphene" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge">
            <region ware="methane" max="80000" />
          </location>
          <module>
            <select ware="graphene" race="paranid"/>
          </module>
        </product>
        
        <product id="par_hullparts" ware="hullparts" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="16" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="hullparts" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_hullparts" ware="hullparts" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="16" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="hullparts" race="paranid"/>
          </module>
        </product>
        
        <product id="sca_majadust" ware="majadust" owner="scaleplate" type="factory">
          <quotas>
            <quota galaxy="20" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[alliance, ownerless]" relation="self" comparison="ge" />
          <module>
            <select ware="majadust" race="paranid"/>
          </module>
        </product>
        
        <product id="par_majasnails" ware="majasnails" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="majasnails" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_majasnails" ware="majasnails" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="majasnails" race="paranid"/>
          </module>
        </product>
        
        <product id="par_medicalsupplies" ware="medicalsupplies" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="20" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="medicalsupplies" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_medicalsupplies" ware="medicalsupplies" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="18" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="medicalsupplies" race="paranid"/>
          </module>
        </product>
        
        <product id="par_microchips" ware="microchips" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="microchips" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_microchips" ware="microchips" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="microchips" race="paranid"/>
          </module>
        </product>
        
        <product id="par_missilecomponents" ware="missilecomponents" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="missilecomponents" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_missilecomponents" ware="missilecomponents" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="missilecomponents" race="paranid"/>
          </module>
        </product>
        
        <product id="par_plasmaconductors" ware="plasmaconductors" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="plasmaconductors" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_plasmaconductors" ware="plasmaconductors" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="plasmaconductors" race="paranid"/>
          </module>
        </product>
        
        <product id="par_quantumtubes" ware="quantumtubes" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="quantumtubes" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_quantumtubes" ware="quantumtubes" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="quantumtubes" race="paranid"/>
          </module>
        </product>
        
        <product id="par_refinedmetals" ware="refinedmetals" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="8" sector="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge">
            <region ware="ore" max="80000" />
          </location>
          <module>
            <select ware="refinedmetals" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_refinedmetals" ware="refinedmetals" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="6" sector="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge">
            <region ware="ore" max="80000" />
          </location>
          <module>
            <select ware="refinedmetals" race="paranid"/>
          </module>
        </product>
        
        <product id="par_scanningarrays" ware="scanningarrays" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="scanningarrays" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_scanningarrays" ware="scanningarrays" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="scanningarrays" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_shieldcomponents" ware="shieldcomponents" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="shieldcomponents" race="paranid"/>
          </module>
        </product>
        
        <product id="par_siliconwafers" ware="siliconwafers" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="6" sector="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge">
            <region ware="silicon" max="80000"/>
          </location>
          <module>
            <select ware="siliconwafers" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_siliconwafers" ware="siliconwafers" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="4" sector="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge">
            <region ware="silicon" max="80000"/>
          </location>
          <module>
            <select ware="siliconwafers" race="paranid"/>
          </module>
        </product>
        
        <product id="par_smartchips" ware="smartchips" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="smartchips" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_smartchips" ware="smartchips" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="smartchips" race="paranid"/>
          </module>
        </product>
        
        <product id="par_sojabeans" ware="sojabeans" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="sojabeans" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_sojabeans" ware="sojabeans" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="sojabeans" race="paranid"/>
          </module>
        </product>
        
        <product id="par_sojahusk" ware="sojahusk" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="sojahusk" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_sojahusk" ware="sojahusk" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="sojahusk" race="paranid"/>
          </module>
        </product>
        
        <product id="par_spices" ware="spices" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="spices" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_spices" ware="spices" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="spices" race="paranid"/>
          </module>
        </product>
        
        <product id="par_superfluidcoolant" ware="superfluidcoolant" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge">
            <region ware="helium" max="80000" />
          </location>
          <module>
            <select ware="superfluidcoolant" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_superfluidcoolant" ware="superfluidcoolant" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge">
            <region ware="helium" max="80000" />
          </location>
          <module>
            <select ware="superfluidcoolant" race="paranid"/>
          </module>
        </product>
        
        <product id="par_turretcomponents" ware="turretcomponents" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="turretcomponents" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_turretcomponents" ware="turretcomponents" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="turretcomponents" race="paranid"/>
          </module>
        </product>
        
        <product id="par_water" ware="water" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge">
            <region ware="ice" max="80000" />
          </location>
          <module>
            <select ware="water" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_water" ware="water" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge">
            <region ware="ice" max="80000" />
          </location>
          <module>
            <select ware="water" race="paranid"/>
          </module>
        </product>
        
        <product id="par_weaponcomponents" ware="weaponcomponents" owner="paranid" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[paranid, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="weaponcomponents" race="paranid"/>
          </module>
        </product>
        
        <product id="hol_weaponcomponents" ware="weaponcomponents" owner="holyorder" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[holyorder, alliance]" relation="self" comparison="ge" />
          <module>
            <select ware="weaponcomponents" race="paranid"/>
          </module>
        </product>
        
        <!-- Teladi Economy -->
        <product id="tel_advancedcomposites" ware="advancedcomposites" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="advancedcomposites" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_advancedelectronics" ware="advancedelectronics" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="advancedelectronics" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_antimattercells" ware="antimattercells" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <region ware="hydrogen" max="80000" />
          </location>
          <module>
            <select ware="antimattercells" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_antimatterconverters" ware="antimatterconverters" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="antimatterconverters" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_claytronics" ware="claytronics" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="claytronics" race="teladi" />
          </module>
        </product>
        
        <product id="tel_dronecomponents" ware="dronecomponents" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="dronecomponents" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_energycells" ware="energycells" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="18" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
            <sunlight min="1" max="3" />
          </location>
          <module>
            <select ware="energycells" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_engineparts" ware="engineparts" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="engineparts" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_fieldcoils" ware="fieldcoils" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="fieldcoils" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_graphene" ware="graphene" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="10" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <region ware="methane" max="80000" />
          </location>
          <module>
            <select ware="graphene" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_hullparts" ware="hullparts" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="28" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="hullparts" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_medicalsupplies" ware="medicalsupplies" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="32" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="medicalsupplies" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_microchips" ware="microchips" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="14" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="microchips" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_missilecomponents" ware="missilecomponents" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="missilecomponents" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_nostropoil" ware="nostropoil" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="10" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="nostropoil" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_plasmaconductors" ware="plasmaconductors" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="plasmaconductors" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_quantumtubes" ware="quantumtubes" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="quantumtubes" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_scanningarrays" ware="scanningarrays" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="scanningarrays" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_shieldcomponents" ware="shieldcomponents" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="2" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="shieldcomponents" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_siliconwafers" ware="siliconwafers" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="10" sector="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <region ware="silicon" max="80000"/>
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="siliconwafers" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_smartchips" ware="smartchips" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="smartchips" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_spaceweed" ware="spaceweed" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="spaceweed" race="teladi"/>
          </module>
        </product>
        
        <product id="pir_spaceweed" ware="spaceweed" owner="scaleplate" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[ownerless]" solitary="true" />
          <module>
            <select ware="spaceweed" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_spices" ware="spices" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="spices" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_sunriseflowers" ware="sunriseflowers" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="8" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="sunriseflowers" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_superfluidcoolant" ware="superfluidcoolant" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <region ware="helium" max="80000" />
          </location>
          <module>
            <select ware="superfluidcoolant" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_swampplant" ware="swampplant" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="6" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.25" />
          </location>
          <module>
            <select ware="swampplant" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_teladianium" ware="teladianium" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="10" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <region ware="ore" max="80000" />
            <economy max="0.5" maxbound="false" />
          </location>
          <module>
            <select ware="teladianium" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_turretcomponents" ware="turretcomponents" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="turretcomponents" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_water" ware="water" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="10" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <region ware="ice" max="80000" />
          </location>
          <module>
            <select ware="water" race="teladi"/>
          </module>
        </product>
        
        <product id="tel_weaponcomponents" ware="weaponcomponents" owner="teladi" type="factory">
          <quotas>
            <quota galaxy="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="[teladi, scaleplate]" relation="self" comparison="ge">
            <economy max="0.75" maxbound="false" />
          </location>
          <module>
            <select ware="weaponcomponents" race="teladi"/>
          </module>
        </product>
        
        <!-- Xenon Economy -->
        <product id="xen_energycells" ware="energycells" owner="xenon" type="factory">
          <quotas>
            <quota galaxy="32" cluster="4" />
          </quotas>
          <location class="galaxy" macro="${galaxy.galaxyPrefix}_galaxy_macro" faction="xenon" relation="self" comparison="ge">
            <security min="0.75"/>
          </location>
          <module>
            <select ware="energycells" race="xenon"/>
          </module>
        </product>
    </products>
  </add>
</diff>