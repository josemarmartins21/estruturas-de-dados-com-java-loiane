<?php

$vetor = [
    12,
    3,
    6,
    2,
];

$aux = 0;
$j = 0;

/* for ($i=1;$i<count($vetor);$i++) {
    $aux = $vetor[$i];
    $j = $i - 1;
    while ($j >= 0 && $vetor[$j] > $aux) {
        $vetor[$j+1] = $vetor[$j];
        $j--;
    }
    $vetor[$j+1] = $aux;
} */

/* for ($i=1; $i < count($vetor); $i++) { 
    $aux = $vetor[$i];
    $j = $i - 1;
    while ($j >= 0 && $vetor[$j] > $aux) {
        $vetor[$j+1] = $vetor[$j];
        $j--;
    }
    $vetor[$j+1] = $aux;
} */
$pos_menor = 0;
for ($i=0; $i < count($vetor); $i++) { 
    $pos_menor = $i;

    for ($j=$i+1; $j < count($vetor); $j++) { 
        if ($vetor[$pos_menor] > $vetor[$j]) {
            $pos_menor = $j;
        }
    }
    $aux = $vetor[$pos_menor];
    $vetor[$pos_menor] = $vetor[$i];
    $vetor[$i] = $aux;
}


foreach ($vetor as $v) {
    echo $v . PHP_EOL;
}