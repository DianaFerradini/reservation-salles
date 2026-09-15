# Relations entre les classes Salle et Reservation

## Règle métier 

Une salle fait l'objet de plusieurs réservations au cours de sa vie. Une réservation ne concerne qu'une seule salle.

Salle 1 ----- * Reservation

## Matérialisation dans le code

La classe Reservation a pour attribut un objet Salle.