-------- Projekt OPS4J.PAX.WICKET --------
anbei findest du die requirements.xml Datei fürs OPS4J.PAX.WICKET Projekt. Diese Datei ist von Jira heruntergeladen und hat einen 
eigenen xml-Struktur, deswegen musste ich einen eigenen xml-Parser dafür schreiben. Also wenn du diese Datei verwenden willst, 
dann bitte in der Klasse RequirementsCoverageLauncher.java in unserem Projekt die Zeile:

SimpleRequirementsParser requirementsParser = new SimpleRequirementsParser(persistence);

mit dieser Zeile umschreiben:

JiraRequirementsParser requirementsParser = new JiraRequirementsParser(persistence);

Schritte zum erstellen des RequirementsCoverage Report:

    bei unserem Projekt mvn clean install ausführen:   
    den ops4j.pax.wicket Projekt clonen: git clone https://github.com/ops4j/org.ops4j.pax.wicket.git
    bei unserem Projekt das folgende Kommando starten:

mvn exec:java -Dexec.args="PATH_TO_OPS4J PATH_TO_OPS4J PATH_TO_REQUIREMENTS.XML PAXWICKET-\d*"
-------- -------- -------- -------- -------- -------- --------

-------- Projekt OPS4J.PAX.WEB --------

ich habe einen Fehler gefunden: unser Projekt hat es damals nicht geschafft, das Projekt ops4j.pax.wicket zu analysieren, weil dieses Projekt JaCoCo nicht eingestellt hat. Deswegen habe ich damals unser Projekt stattdessen aufs Projekt ops4j.pax.web gestartet.
Also die Schritte nochmal:
* dieses Repository Clonen: git clone https://github.com/ops4j/org.ops4j.pax.web.git
* die requirements.xml vom Anhang herunterladen
* den JiraRequirementsParser verwenden (wie in der letzten email)
* mvn clean install bei unsererm Projekt ausführen
* mvn exec:java -Dexec.args="PATH_TO_OPS4J_WEB PATH_TO_OPS4J_WEB PATH_TO_REQUIREMENTS.XML PAXWEB-\d*"
-------- -------- -------- -------- -------- -------- -------- 


-------- -------- Projekt QPID-JAVA -------- --------
ich habe jetzt das Projekt, der ich geforkt und heute dir geschickt habe, nochmal gecheckt und habe gemerkt, dass der originaler Host nicht 
Apache ist! Ich habe die originale Repository nicht mehr gefunden. Anscheinend hat Apache das Projekt von GitHub gelöscht!
Die geforkte Version scheint nicht sehr robust zu sein. Deswegen habe ich eine altere Version auf GitHub gepusht, mit der ich unser 
Programm ursprünglich getestet habe. (die requirements.xml Datei ist schon dabei)

Schritte zum Erstellen des RequirementsCoverage Report:

    die Version vom folgenden Repo Clonen: git clone https://github.com/moazbaghdadi/qpid-java-old.git
    die Zeile aus der obigen Beschreibung in unserem Code wieder umtauschen (den SimpleRequirementsParser verwenden).
    bei unserm Projekt mvn clean install ausführen
    bei unserm Projekt das folgenden Kommando starten:

mvn exec:java -Dexec.args="PATH_TO_QPID PATH_TO_QPID PATH_TO_REQUIREMENTS.XML QPID-\d*"
-------- -------- -------- -------- -------- -------- -------- 

