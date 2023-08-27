#Author: brahim bounguicha
Feature: Consultation des menus de home page

  Background: 
    Given Utilisateur est connectee avec le bon username "Admin" et le bon password "admin123"

  Scenario Outline: Acceder aux page de chaque menu de la page home
    When Utilisateur clique sur le "<menu>"
    Then la pade de menu est affiche

    Examples: 
      | menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
      | Buzz        |
