<?php


$arr = [
    1, 
    2, 
    3,
    4,  
    5,
    6,
    7, 
];

print binarySearch($arr, 100, count($arr) - 1);



function binarySearch($arr, $searched, $fim, $inicio = 0) {
    $meio = floor(($fim + $inicio) / 2);
    if ($arr[$meio] === $searched || $fim <= $inicio) {
        return $arr[$meio] === $searched ? $arr[$meio] : 0;
    }
    return $arr[$meio] < $searched ? binarySearch($arr, $searched,  $fim,$meio + 1 ) : 
    binarySearch($arr, $searched, $meio - 1, $inicio) ;
}