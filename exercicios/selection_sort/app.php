<?php


$vetor = [10, 5, 0, 1];

$menor = $vetor[0];


/* for ($i=0; $i < count($vetor); $i++) { 
    $posicao_menor = $i;

    for ($j=$i +1; $j < count($vetor); $j++) { 
        if ($vetor[$posicao_menor] > $vetor[$j]) {
            $posicao_menor = $j;
        }
    }
    $aux = $vetor[$posicao_menor];
    $vetor[$posicao_menor] = $vetor[$i];
    $vetor[$i] = $aux;

} */

/* 
$aux = 0;
$j = 0;    
for ($i=1; $i < count($vetor); $i++) { 
    $aux = $vetor[$i];
    $j = $i - 1;
    while ($j >= 0 && $vetor[$j] > $aux) {
        $vetor[$j+1] = $vetor[$j];
        $j--;
    }
    $vetor[$j+1] = $aux;
} */



for ($i=0; $i < count($vetor); $i++) { 
    if ($vetor[$i] < $menor) {
        $menor = $vetor[$i];
    }
}


print $menor;
