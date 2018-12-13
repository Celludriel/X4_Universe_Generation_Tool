<?xml version="1.0" encoding="utf-8"?>
<!--Remove all loaded before really hard-->
<diff>
  <replace sel="/jobs">
    <jobs>
      <#list galaxy.jobs as job>
      <job id="${job.id}" name="${job.name}">
      </job>
      </#list>

      <!-- MASS TRAFFIC -->
      <!--argon sectors-->
      <job id="masstraffic_argon_civilian">
        <task task="masstraffic.generic"/>
        <location class="sector" factionrace="argon"/>
        <quota sector="1000"/>
        <masstraffic ref="masstraffic_argon_civilian"/>
      </job>
      <!--argon stations-->
      <job id="masstraffic_argon_police">
        <task task="masstraffic.police"/>
        <location class="station" faction="[argon, antigone]"/>
        <quota station="5"/>
        <masstraffic ref="masstraffic_argon_police"/>
      </job>
      <job id="masstraffic_argon_criminal">
        <task task="masstraffic.generic"/>
        <location class="station" faction="[argon, antigone]"/>
        <quota sector="2" station="1"/>
        <masstraffic ref="masstraffic_argon_civilian" respawndelay="300" relaunchdelay="60">
          <owner exact="faction.criminal" overridenpc="true"/>
        </masstraffic>
      </job>
      <!--argon station modules-->
      <job id="masstraffic_argon_dockarea">
        <task task="masstraffic.generic"/>
        <location class="dockarea" factionrace="argon"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_argon_dockarea"/>
      </job>
      <job id="masstraffic_argon_pier">
        <task task="masstraffic.generic"/>
        <location class="pier" factionrace="argon"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_argon_pier"/>
      </job>
      <job id="masstraffic_argon_storage">
        <task task="masstraffic.generic"/>
        <location class="storage" factionrace="argon"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_argon_storage"/>
      </job>
      <job id="masstraffic_argon_production">
        <task task="masstraffic.generic"/>
        <location class="production" factionrace="argon"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_argon_production"/>
      </job>
      <job id="masstraffic_argon_buildmodule">
        <task task="masstraffic.generic"/>
        <location class="buildmodule" factionrace="argon"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_argon_buildmodule"/>
      </job>
      <job id="masstraffic_argon_defencemodule">
        <task task="masstraffic.generic"/>
        <location class="defencemodule" factionrace="argon"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_argon_defencemodule"/>
      </job>

      <!--teladi sectors-->
      <job id="masstraffic_teladi_civilian">
        <task task="masstraffic.generic"/>
        <location class="sector" factionrace="teladi"/>
        <quota sector="1000"/>
        <masstraffic ref="masstraffic_teladi_civilian"/>
      </job>
      <!--teladi stations-->
      <job id="masstraffic_teladi_police">
        <task task="masstraffic.police"/>
        <location class="station" faction="[teladi, ministry]"/>
        <quota station="5"/>
        <masstraffic ref="masstraffic_ministry_police"/>
      </job>
      <job id="masstraffic_teladi_criminal">
        <task task="masstraffic.generic"/>
        <location class="station" faction="[teladi, ministry]"/>
        <quota sector="2" station="1"/>
        <masstraffic ref="masstraffic_teladi_civilian" respawndelay="300" relaunchdelay="60">
          <owner exact="faction.criminal" overridenpc="true"/>
        </masstraffic>
      </job>
      <!--teladi station modules-->
      <job id="masstraffic_teladi_dockarea">
        <task task="masstraffic.generic"/>
        <location class="dockarea" factionrace="teladi"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_teladi_dockarea"/>
      </job>
      <job id="masstraffic_teladi_pier">
        <task task="masstraffic.generic"/>
        <location class="pier" factionrace="teladi"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_teladi_pier"/>
      </job>
      <job id="masstraffic_teladi_storage">
        <task task="masstraffic.generic"/>
        <location class="storage" factionrace="teladi"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_teladi_storage"/>
      </job>
      <job id="masstraffic_teladi_production">
        <task task="masstraffic.generic"/>
        <location class="production" factionrace="teladi"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_teladi_production"/>
      </job>
      <job id="masstraffic_teladi_buildmodule">
        <task task="masstraffic.generic"/>
        <location class="buildmodule" factionrace="teladi"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_teladi_buildmodule"/>
      </job>
      <job id="masstraffic_teladi_defencemodule">
        <task task="masstraffic.generic"/>
        <location class="defencemodule" factionrace="teladi"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_teladi_defencemodule"/>
      </job>

      <!--paranid sectors-->
      <job id="masstraffic_paranid_civilian">
        <task task="masstraffic.generic"/>
        <location class="sector" factionrace="paranid"/>
        <quota sector="1000"/>
        <masstraffic ref="masstraffic_paranid_civilian"/>
      </job>
      <!--paranid stations-->
      <job id="masstraffic_paranid_police">
        <task task="masstraffic.police"/>
        <location class="station" faction="[paranid, alliance]"/>
        <quota station="5"/>
        <masstraffic ref="masstraffic_paranid_police"/>
      </job>
      <job id="masstraffic_holyorder_police">
        <task task="masstraffic.police"/>
        <location class="station" faction="holyorder"/>
        <quota station="5"/>
        <masstraffic ref="masstraffic_holyorder_police"/>
      </job>
      <job id="masstraffic_paranid_criminal">
        <task task="masstraffic.generic"/>
        <location class="station" faction="[paranid, holyorder]"/>
        <quota sector="2" station="1"/>
        <masstraffic ref="masstraffic_paranid_civilian" respawndelay="300" relaunchdelay="60">
          <owner exact="faction.criminal" overridenpc="true"/>
        </masstraffic>
      </job>
      <!--paranid station modules-->
      <job id="masstraffic_paranid_dockarea">
        <task task="masstraffic.generic"/>
        <location class="dockarea" factionrace="paranid"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_paranid_dockarea"/>
      </job>
      <job id="masstraffic_paranid_pier">
        <task task="masstraffic.generic"/>
        <location class="pier" factionrace="paranid"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_paranid_pier"/>
      </job>
      <job id="masstraffic_paranid_storage">
        <task task="masstraffic.generic"/>
        <location class="storage" factionrace="paranid"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_paranid_storage"/>
      </job>
      <job id="masstraffic_paranid_production">
        <task task="masstraffic.generic"/>
        <location class="production" factionrace="paranid"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_paranid_production"/>
      </job>
      <job id="masstraffic_paranid_buildmodule">
        <task task="masstraffic.generic"/>
        <location class="buildmodule" factionrace="paranid"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_paranid_buildmodule"/>
      </job>
      <job id="masstraffic_paranid_defencemodule">
        <task task="masstraffic.generic"/>
        <location class="defencemodule" factionrace="paranid"/>
        <quota station="20"/>
        <masstraffic ref="masstraffic_paranid_defencemodule"/>
      </job>

      <!--xenon sectors-->
      <!-- TODO: activate below when we get actual xenon mass traffic ships. -->
      <job id="masstraffic_xenon_civilian">
        <task task="masstraffic.generic"/>
        <location class="sector" factionrace="xenon"/>
        <quota sector="1000"/>
        <masstraffic ref="masstraffic_xenon_civilian"/>
      </job>
      <job id="masstraffic_xenon_station">
        <task task="masstraffic.generic"/>
        <location class="station" factionrace="xenon"/>
        <quota station="100"/>
        <masstraffic ref="masstraffic_xenon_civilian"/>
      </job>

      <!--habitation modules (using race-appropriate ships, no matter who actually owns it)-->
      <job id="masstraffic_hab_arg_s_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_arg_s_01_macro"/>
        <quota station="50"/>
        <masstraffic ref="masstraffic_argon_civilian"/>
      </job>
      <job id="masstraffic_hab_arg_m_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_arg_m_01_macro"/>
        <quota station="60"/>
        <masstraffic ref="masstraffic_argon_civilian"/>
      </job>
      <job id="masstraffic_hab_arg_l_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_arg_l_01_macro"/>
        <quota station="70"/>
        <masstraffic ref="masstraffic_argon_civilian"/>
      </job>
      <job id="masstraffic_hab_tel_s_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_tel_s_01_macro"/>
        <quota station="50"/>
        <masstraffic ref="masstraffic_teladi_civilian"/>
      </job>
      <job id="masstraffic_hab_tel_m_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_arg_m_01_macro"/>
        <quota station="60"/>
        <masstraffic ref="masstraffic_teladi_civilian"/>
      </job>
      <job id="masstraffic_hab_tel_l_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_tel_l_01_macro"/>
        <quota station="70"/>
        <masstraffic ref="masstraffic_teladi_civilian"/>
      </job>
      <job id="masstraffic_hab_par_s_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_par_s_01_macro"/>
        <quota station="50"/>
        <masstraffic ref="masstraffic_paranid_civilian"/>
      </job>
      <job id="masstraffic_hab_par_m_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_par_m_01_macro"/>
        <quota station="60"/>
        <masstraffic ref="masstraffic_paranid_civilian"/>
      </job>
      <job id="masstraffic_hab_par_l_01">
        <task task="masstraffic.generic"/>
        <location class="habitation" macro="hab_par_l_01_macro"/>
        <quota station="70"/>
        <masstraffic ref="masstraffic_paranid_civilian"/>
      </job>

      <job id="masstraffic_effectzone">
        <task task="masstraffic.generic"/>
        <location class="zone" macro="effectzone_macro"/>
        <quota zone="2000"/>
        <masstraffic ref="masstraffic_argon_civilian"/>
      </job>
    </jobs>
  </replace>
</diff>