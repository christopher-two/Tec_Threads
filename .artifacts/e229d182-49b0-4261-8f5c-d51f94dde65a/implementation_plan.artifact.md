# Renombrar paquete de `humillandobots` a `tec`

Este plan detalla los pasos para cambiar el nombre del paquete de `org.christophertwo.humillandobots.threads` a `org.christophertwo.tec.threads` en todo el proyecto.

## Cambios Propuestos

### [Android App]

#### [MODIFY] [build.gradle.kts](file:///home/christopher/AndroidStudioProjects/HumillandoBots/app/build.gradle.kts)
- Actualizar `namespace` a `org.christophertwo.tec.threads`.
- Actualizar `applicationId` a `org.christophertwo.tec.threads`.

#### [RENAME] Directorios
- Renombrar `app/src/main/java/org/christophertwo/humillandobots` a `app/src/main/java/org/christophertwo/tec`.
- Renombrar `app/src/androidTest/java/org/christophertwo/humillandobots` a `app/src/androidTest/java/org/christophertwo/tec`.
- Renombrar `app/src/test/java/org/christophertwo/humillandobots` a `app/src/test/java/org/christophertwo/tec`.

#### [MODIFY] Archivos de código fuente
Actualizar las declaraciones de `package` e `imports` en todos los archivos `.kt`:
- `MainActivity.kt`
- `core/ui/Colors.kt`
- `core/ui/Theme.kt`
- `ExampleInstrumentedTest.kt` (también actualizar el string de la aserción)
- `ExampleUnitTest.kt`

## Plan de Verificación

### Pruebas Automatizadas
- Ejecutar `./gradlew assembleDebug` para verificar que el proyecto compila correctamente con el nuevo paquete.
- Ejecutar `./gradlew test` para verificar las pruebas unitarias.

### Verificación Manual
- Verificar que el IDE reconoce correctamente la nueva estructura de paquetes.
