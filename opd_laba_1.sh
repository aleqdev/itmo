#!/bin/bash

cd ~
mkdir -p lab0/furret5/deino lab0/furret5/magikarp lab0/furret5/numel lab0/pansage7/luxray lab0/pansage7/aggron lab0/spearow6/exploud lab0/spearow6/hoothoot lab0/spearow6/pawniard

echo -e "Тип покемона NORMAL NONE" > lab0/furret5/stoutland
echo -e "satk=8 sdef=6\nspd=6" > lab0/furret5/dewott
echo -e "satk=7 sdef=8 spd=6" > lab0/furret5/wartortle
echo -e "Тип диеты\nCarnivore" > lab0/krookodile0
echo -e "Ходы Body Slam Bullet Seed Dark Pulse Defense\nCurl Double-Edge Foul Play Fury Cutter Giga Drain Low Kick Mega Kick\nMud-Slap Razor Leaf Rollout Seed Bomb Sleep Talk Snore Spite Swift Synthesis Worry Seed" > lab0/nuzleaf1
echo -e "Ходы Body Slam Dark Pulse Double-Edge\nFoul Play Icy Wind Knock Off Magic Coat Magic Room Metronome Mud-Slap\nOminous Wind Pain Split Role Play Shock Wave Skill Swap Sleep Talk\nSnatch Snore Spite Sucker Punch Trick" > lab0/pansage7/banette
echo -e "Тип покемона GRASS\nNONE" > lab0/pansage7/bellossom
echo -e "Ходы Air Cutter Astonish+ Dark Pulse Defog\nDouble-Edge Foul Play Hazet Heat Wave Icy Wind Mud-Slap Ominous Wind\nPursuit+ Roost Sky Attack Sleep Talk Snatch Snore Spite Steel\nWing\nSucker Punch Superpower Swift Tailwind Twister Uproar Wing\nAttack+" > lab0/pansage7/honchkrow
echo -e "satk=8 sdef=8 spd=7" > lab0/pansage7/lanturn
echo -e "Тип покемона FIRE\nNONE" > lab0/rapidash1
echo -e "Возможности Overland=8 Sky=7 Surface=8 Jump=3 Power=5\nIntelligence=4 Invisibility=0 Phasing=0 Telepath=0" > lab0/spearow6/dusknoir

chmod 732 lab0/furret5
chmod 044 lab0/furret5/stoutland
chmod 440 lab0/furret5/dewott
chmod 700 lab0/furret5/deino
chmod 330 lab0/furret5/magikarp
chmod 335 lab0/furret5/numel
chmod 440 lab0/furret5/wartortle
chmod 440 lab0/krookodile0
chmod 600 lab0/nuzleaf1
chmod 767 lab0/pansage7
chmod 624 lab0/pansage7/banette
chmod 064 lab0/pansage7/bellossom
chmod u=r,g=,o= lab0/pansage7/honchkrow
chmod u=rwx,g=rx,o=x lab0/pansage7/luxray
chmod u=r-x,g=wx,o=x lab0/pansage7/aggron
chmod u=r,g=r,o= lab0/rapidash1
chmod u=rwx,g=rw,o=r lab0/spearow6/exploud
chmod u=r,g=wx,o=wx lab0/spearow6/hoothoot
chmod u=rwx,g=rw,o=rx lab0/spearow6/pawniard
chmod u=rw,g=,o= lab0/spearow6/dusknoir

cat lab0/pansage7/lanturn lab0/furret5/dewott > lab0/rapidash1_34
cat lab0/krookodile0 > lab0/furret5/dewottkrookodile
ln -s pansage7 lab0/Copy_72
cp -r lab0/spearow6 lab0/spearow6/exploud/
ln -s ../rapidash1 lab0/furret5/stoutlandrapidash
ln lab0/rapidash1 lab0/pansage7/banetterapidash
cp lab0/rapidash1 lab0/furret5/magikarp/

{ wc -m lab0/furret5/stoutland lab0/furret5/dewott lab0/furret5/wartortle lab0/pansage7/banette lab0/pansage7/bellossom lab0/pansage7/honchkrow 2>/dev/null; } > /tmp/count_chars.txt

ls -lR lab0 2>&1 | grep '.*1$' | sort -k5 -n

find lab0 -type f -name '*1' -exec cat {} + 2>&1 | sort

cat lab0/furret5/* 2>/dev/null | sort -r

find lab0 -type f -name '*1' -exec cat {} + 2>/dev/null | sort -r

ls -lR lab0 2>&1 | grep de | sort -k2 -n | tail -n 2

rm -f lab0/krookodile0
rm -f lab0/furret5/wartortle
rm -f lab0/furret5/stoutlandrapida*
rm -f lab0/pansage7/banetterapida*
rm -rf lab0/pansage7
rm -rf lab0/spearow6/exploud
