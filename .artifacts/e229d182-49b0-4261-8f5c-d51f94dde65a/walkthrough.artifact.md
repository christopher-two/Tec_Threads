# Walkthrough - Renombrar paquete a `tec`

Se ha completado con éxito el cambio de nombre del paquete de `org.christophertwo.humillandobots.threads` a `org.christophertwo.tec.threads`.

## Cambios realizados

### Configuración de Gradle
- Se actualizaron `namespace` y `applicationId` en [build.gradle.kts](file:///home/christopher/AndroidStudioProjects/HumillandoBots/app/build.gradle.kts).

### Estructura de archivos
- Se movieron todos los archivos de la carpeta `humillandobots` a la nueva carpeta `tec` en las rutas de `main`, `androidTest` y `test`.
- Se eliminaron los directorios antiguos.

### Código Fuente
Se actualizaron las declaraciones de paquete en los siguientes archivos:
- [MainActivity.kt](file:///home/christopher/AndroidStudioProjects/HumillandoBots/app/src/main/java/org/christophertwo/tec/threads/MainActivity.kt)
- [Colors.kt](file:///home/christopher/AndroidStudioProjects/HumillandoBots/app/src/main/java/org/christophertwo/tec/threads/core/ui/Colors.kt)
- [Theme.kt](file:///home/christopher/AndroidStudioProjects/HumillandoBots/app/src/main/java/org/christophertwo/tec/threads/core/ui/Theme.kt)
- [ExampleInstrumentedTest.kt](file:///home/christopher/AndroidStudioProjects/HumillandoBots/app/src/androidTest/java/org/christophertwo/tec/threads/ExampleInstrumentedTest.kt)
- [ExampleUnitTest.kt](file:///home/christopher/AndroidStudioProjects/HumillandoBots/app/src/test/java/org/christophertwo/tec/threads/ExampleUnitTest.kt)

## Verificación
- **Gradle Sync:** Exitoso.
- **Build:** Se ejecutó `./gradlew app:assembleDebug` con éxito.
