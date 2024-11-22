default: build

build:
	./gradlew --warning-mode=all build
test:
	./gradlew --warning-mode=all test
javadoc:
	./gradlew --warning-mode=all javadoc
lint:
	./gradlew --warning-mode=all lint
archive:
	./gradlew --warning-mode=all publishReleasePublicationToLocalRepository
tasks:
	./gradlew tasks
clean:
	./gradlew clean
