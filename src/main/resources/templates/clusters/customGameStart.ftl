<?xml version="1.0" encoding="utf-8"?>
<mdscript name="custom_gamestart" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="md.xsd">
  <cues>
    <cue name="ExecuteCustomGameStart" module="${galaxy.galaxyPrefix}_galaxy_main">
      <conditions>
        <event_cue_signalled cue="md.Setup.GameStart" />
      </conditions>
      <actions>
		<set_value name="player.entity.$x4ep1_hq_research_unlocked"/>
      </actions>
    </cue>
  </cues>
</mdscript>
