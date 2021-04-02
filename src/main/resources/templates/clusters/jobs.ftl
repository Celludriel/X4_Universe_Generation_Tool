<?xml version="1.0" encoding="utf-8"?>
<!--Remove all loaded before really hard-->
<diff>
  <replace sel="/jobs">
    <jobs>
      <#list galaxy.jobs as job>
      <job id="${job.id}" <#if job.name??>name="${job.name}"</#if> <#if job.startActive??>startactive="${job.startActive?c}"</#if> <#if job.disabled??>disabled="${job.disabled?c}"</#if> <#if job.comment??>comment="${job.comment}"</#if> <#if job.description??>description="${job.description}"</#if> <#if job.fullname??>fullname="${job.fullname?c}"</#if> <#if job.ignorecommanderwares??>ignorecommanderwares="${job.ignorecommanderwares?c}"</#if>">
        <#if job.basket??>
        <basket basket="${job.basket.basket}" <#if job.basket.comment??>comment="${job.basket.comment}"</#if>/>
        </#if>
        <#if job.category??>
        <category faction="${job.category.faction}" tags="[${job.category.tags}]" <#if job.category.size??>size="${job.category.size}"</#if> <#if job.basket.comment??>comment="${job.category.comment}"</#if>/>
        </#if>
        <orders>
        <#list job.orders as order>
            <order order="${order.order}" default="${order.defaultOrder?c} <#if order.comment??>comment="${order.comment}"</#if>">
            <#list order.params as key, value>
                <param name="${key}" value="${value}"/>
            </#list>
            </order>
        </#list>
        </orders>
        <tasks>
        <#list job.tasks as task>
            <task task="${task.task}" <#if task.entitytype??>entitytype="${task.comment}"</#if> <#if task.comment??>comment="${task.comment}"</#if>>
            <#list task.params as key, value>
                <param name="${key}" value="${value}"/>
            </#list>
            </task>
        </#list>
        </tasks>




        <#if job.hasModifiers()>
        <modifiers <#if job.rebuild??>rebuild="${job.rebuild?c}"</#if> <#if job.commandeerable??>commandeerable="${job.commandeerable?c}"</#if> <#if job.subordinate??>subordinate="${job.subordinate?c}"</#if> />
        </#if>


        <quota <#if job.jobQuota.galaxy?? && job.jobQuota.galaxy != 0>galaxy="${job.jobQuota.galaxy}"</#if> <#if job.jobQuota.maxGalaxy?? && job.jobQuota.maxGalaxy != 0>maxgalaxy="${job.jobQuota.maxGalaxy}"</#if> <#if job.jobQuota.cluster?? && job.jobQuota.cluster != 0>cluster="${job.jobQuota.cluster}"</#if> <#if job.jobQuota.sector?? && job.jobQuota.sector != 0>sector="${job.jobQuota.sector}"</#if> <#if job.jobQuota.zone?? && job.jobQuota.zone != 0>zone="${job.jobQuota.zone}"</#if> <#if job.jobQuota.wing?? && job.jobQuota.wing != 0>wing="${job.jobQuota.wing}"</#if> <#if job.jobQuota.variation?? && job.jobQuota.variation != 0>variation="${job.jobQuota.variation}"</#if> <#if job.jobQuota.station?? && job.jobQuota.station != 0>station="${job.jobQuota.station}"</#if> />
        <#if job.jobLocation??>
        <location class="${job.jobLocation.locationClass}" <#if job.jobLocation.macro??>macro="${job.jobLocation.macro}"<#else>macro="${galaxy.galaxyPrefix}_galaxy_macro"</#if> <#if job.jobLocation.relation??>relation="${job.jobLocation.relation}"</#if> <#if job.jobLocation.comparison??>comparison="${job.jobLocation.comparison}"</#if> <#if job.jobLocation.regionBasket??>regionbasket="${job.jobLocation.regionBasket}"</#if> <#if job.jobLocation.factions?size != 0>faction="${job.jobLocation.getPrintFactions()}"</#if> />
        </#if>
        <environment buildatshipyard="${job.buildatshipyard?c}"/>
        <#if job.ship??>
        <ship>
          <select faction="${job.ship.getFactionPrint()}" tags="[${job.ship.getTagPrint()}]" <#if job.ship.size??>size="${job.ship.size.getName()}"</#if> />
          <#if job.ship.levelMin?? && job.ship.levelMax??>
          <loadout>
            <level min="${job.ship.levelMin}" max="${job.ship.levelMax}"/>
          </loadout>
          </#if>
          <owner exact="${job.ship.getOwner()}" overridenpc="${job.ship.overridenpc?c}"/>
          <#if job.ship.cargo??>
          <cargo>
            <wares multiple="${job.ship.cargo.multiple?c}">
              <fillpercent min="${job.ship.cargo.min?c}" max="${job.ship.cargo.max?c}" profile="${job.ship.cargo.profile}"/>
            </wares>
          </cargo>
          </#if>
          <#if job.ship.units?size != 0>
          <units>
            <#list job.ship.units as unit>
            <unit category="${unit.category}" min="${unit.min?c}" max="${unit.max?c}" />
            </#list>
          </units>
          </#if>
        </ship>
        </#if>
        <#if job.subordinates??>
        <subordinates>
          <#list job.subordinates as subordinate>
          <subordinate job="${subordinate}" />
          </#list>
        </subordinates>
        </#if>
        <#if job.encounters??>
        <encounters id="${job.encounters}"/>
        </#if>
        <#if job.time??>
        <time interval="${job.time}"/>
        </#if>
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