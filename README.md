# Le jeu Find my word
## Présentation du jeu FindMyWord
L'application est basée sur un jeu populaire de devinette de mots. Les joueurs essaient de deviner un mot de cinq lettres. Des points sont attribués en fonction de la rapidité avec laquelle un joueur devine le mot. Le joueur reçoit des retours sur chaque tentative pour l'orienter vers la bonne réponse.

## Description des règles de FindMyWord
Pour jouer à FindMyWord, un joueur dispose de six tentatives pour deviner un mot de cinq lettres. Après chaque tentative, les lettres du mot sont mises en évidence comme suit :

 - La lettre correcte à la bonne position a un fond vert
 - La lettre correcte à la mauvaise position a un fond orange
 - Les lettres incorrectes qui ne figurent pas dans le mot ont un fond noir
![](https://einfo-learning.fr/moodle/pluginfile.php/17628/mod_page/content/13/ihm_findmyword.jpg)
## Dans ce travail pratique j'ai appliqué le développement dirigé par les tests (TDD)
### Principe

Le principe est de commencer par écrire le test avant d'écrire le code de production. On dit que le test doit être d'abord en échec (fail) puis on écrit petit à petit le code pour faire passer et garder le test en succès (passed). On parle de couleur, qui se refère au feu de signalisation. On commence par un test rouge d'abord, on le fait passer et on le garde au vert.

