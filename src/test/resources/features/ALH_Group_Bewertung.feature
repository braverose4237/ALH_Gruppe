@FNW-568
Feature: Default

	#Bewertung der ALH Group auf Kununu.com
	@FNW-569
	Scenario: Bewertung der ALH Group auf Kununu.com
		Feature: Bewertung der ALH Group 
		
		  Scenario:
		    When Der Benutzer navigiert zur Website kununu.com.
		    And Der Benutzer akzeptiert Cookies.
		    And Der Benutzer gibt ALH Group in das Suchfeld auf kununu ein und drückt auf die Suchtaste.
		    Then Der Benutzer erhält die Bewertungen von Kununu und gibt eine Bewertung aus.

	#Bewertung der ALH Group auf Glassdoor.com
