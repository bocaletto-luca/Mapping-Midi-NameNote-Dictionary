<?php
// example.php
$noteNamesEn = include 'midi_mapping.php';

$midiNote = 60;
echo $noteNamesEn[$midiNote];   // → C4
