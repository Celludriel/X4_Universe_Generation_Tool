<?xml version="1.0"?>
<components>
	<component name="empty_space" class="celestialbody">
		<source geometry="extensions\${galaxy.galaxyName}\assets\environments\cluster\empty_space_data"/>
		<layers>
			<layer>
				<waypoints/>
				<lights>
					<omni name="XU Omni01" shadow="0" r="255" g="255" b="223" range="1E+11" shadowrange="1E+11" lighteffect="1" lenseffect="sun_c_14" trigger="1" intensity="1.15">
						<lightanimations/>
						<offset>
							<position x="-3.131925E+08" y="2.316948E+08" z="-1.579728E+08"/>
						</offset>
					</omni>
					<omni name="XU Omni02" shadow="0" r="34" g="50" b="80" range="1E+11" shadowrange="1E+11" lighteffect="1" trigger="1" intensity="0.85">
						<lightanimations/>
						<offset>
							<position x="3.13193E+08" y="-2.31695E+08" z="1.57973E+08"/>
						</offset>
					</omni>
				</lights>
			</layer>
		</layers>
		<connections>
			<connection name="container" tags="contents" value="0" optional="0"/>
			<connection name="position" tags="position" value="1" optional="1"/>
			<connection name="space" tags="celestialbody">
				<offset/>
			</connection>
			<connection name="Connection01" tags="part  ">
				<offset/>
				<parts>
					<part name="part_c14_bg">
						<lods>
							<lod index="0">
								<materials>
									<material id="1" ref="p1.p1_env_bg_vertexcolor"/>
								</materials>
							</lod>
						</lods>
						<size>
							<max x="6.044349E+08" y="6.057278E+08" z="6.044349E+08"/>
							<center x="-62.5" y="0" z="62.5"/>
						</size>
					</part>
				</parts>
			</connection>
			<connection name="Connection02" tags="part  ">
				<offset>
					<position x="1.226121E+07" y="0" z="8100438"/>
					<quaternion qx="-0" qy="-6.975656E-02" qz="-0" qw="-0.9975641"/>
				</offset>
				<parts>
					<part name="Background">
						<lods>
							<lod index="0">
								<materials>
									<material id="1" ref="p1.backgroundstars"/>
								</materials>
							</lod>
						</lods>
						<size>
							<max x="4.255449E+08" y="4.25545E+08" z="4.25545E+08"/>
							<center x="76.17188" y="31.25" z="-0.9765625"/>
						</size>
						<pivot>
							<offset>
								<position x="0" y="-50000" z="0"/>
							</offset>
						</pivot>
					</part>
				</parts>
			</connection>
			<connection name="Connection03" tags="part  ">
				<offset>
					<position x="-2.161923E+07" y="-7.568397E+07" z="-7.121897E+07"/>
				</offset>
				<parts>
					<part name="nebula01">
						<lods>
							<lod index="0">
								<materials>
									<material id="1" ref="p1.staratlas_additive"/>
								</materials>
							</lod>
						</lods>
						<size>
							<max x="5.197141E+08" y="4.875068E+08" z="4.941834E+08"/>
							<center x="-17.57813" y="31.25" z="-15.625"/>
						</size>
					</part>
				</parts>
			</connection>
			<connection name="Connection04" tags="part  ">
				<offset>
					<position x="7763844" y="2.396457E+07" z="-4.531553E+07"/>
				</offset>
				<parts>
					<part name="smallstar01">
						<lods>
							<lod index="0">
								<materials>
									<material id="1" ref="p1.staratlas_additive"/>
								</materials>
							</lod>
						</lods>
						<size>
							<max x="3.896289E+08" y="3.47486E+08" z="4.076692E+08"/>
							<center x="1411328" y="-7947026" z="167003.9"/>
						</size>
					</part>
				</parts>
			</connection>
			<connection name="Connection05" tags="part  ">
				<offset>
					<position x="-6417133" y="-1.23163E+07" z="3950063"/>
				</offset>
				<parts>
					<part name="mediumstar01">
						<lods>
							<lod index="0">
								<materials>
									<material id="1" ref="p1.staratlas_additive"/>
								</materials>
							</lod>
						</lods>
						<size>
							<max x="3.934252E+08" y="3.942671E+08" z="3.935335E+08"/>
							<center x="1.197432E+07" y="1.124952E+07" z="-1.093081E+07"/>
						</size>
					</part>
				</parts>
			</connection>
			<connection name="Connection6" tags="part  ">
				<offset>
					<position x="-3.676781E+07" y="7454586" z="-1.117209E+07"/>
				</offset>
				<parts>
					<part name="bigstar01">
						<lods>
							<lod index="0">
								<materials>
									<material id="1" ref="p1.staratlas_additive"/>
								</materials>
							</lod>
						</lods>
						<size>
							<max x="4.039788E+08" y="3.474537E+08" z="4.08301E+08"/>
							<center x="2.406598E+07" y="-6494586" z="-9933430"/>
						</size>
					</part>
				</parts>
			</connection>
		</connections>
	</component>
</components>