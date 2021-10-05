

# Autor: Fernando Antonio Galvez Moreno

@stories

Feature: AcademyChoucair

  As a user, I want to learn how to automate in screamply at the choucair Academy with the automation course


  @scenario1


  Scenario: Search for a automation course

    Given than fernando wants to learn automation at the academy choucair

      |strUser      | strPassword      |
      |  1119893862  | Choucair2021*   |

    When he search for the course on the choucair academy platfor
      | strCourse               |
      | Metodología Bancolombia |

    Then he finds the course called resources Metodología Bancolombia
