# Sistema de Gestión de Notas - Diario v1

## Descripción General
Aplicación de escritorio para crear, leer, editar y buscar notas personales. Las notas se almacenan en el sistema de archivos local sin necesidad de una base de datos.

## Arquitectura del Proyecto

### 1. Capa de Datos (`capaDatos`)
**Clase: `Nota.java`**
- Modelo simple para transportar datos en memoria RAM
- Atributos:
  - `titulo`: String - Título de la nota
  - `contenido`: String - Cuerpo/Contenido de la nota
  - `nombreArchivo`: String - Nombre del archivo asociado (YYYYMMDD_HHMMSS.txt)

### 2. Capa de Lógica (`CapaLogica`)
**Clase: `GestorArchivos.java`**

Encargada de toda la gestión de archivos y búsqueda:

#### Métodos Principales:

1. **`listar()`**
   - Lee la carpeta de notas
   - Filtra solo archivos .txt
   - Extrae la primera línea de cada archivo (título)
   - Devuelve una lista ordenada cronológicamente (más reciente primero)

2. **`guardar(titulo, contenido)`**
   - Crea un nuevo archivo con nombre basado en la fecha y hora actual
   - Formato: `YYYYMMDD_HHMMSS.txt`
   - Primera línea: título
   - Líneas siguientes: contenido
   - Garantiza orden cronológico automático

3. **`leer(nombreArchivo)`**
   - Recupera todo el contenido de un archivo específico
   - Retorna un objeto `Nota` con título y contenido

4. **`buscarBinaria(termino)`** ⭐ ALGORITMO DE BÚSQUEDA BINARIA
   - Implementa búsqueda binaria para encontrar notas por título
   - Las notas se ordenan alfabéticamente internamente
   - Realiza búsqueda por coincidencia de prefijo
   - Complejidad: O(log n) para localizar + O(k) para recopilar resultados
   - Ideal para buscar rápidamente en aplicaciones con muchas notas

5. **`eliminar(nombreArchivo)`**
   - Elimina una nota del sistema de archivos

### 3. Capa de Presentación (`capaPresentacion`)
**Clase: `PantallaPrincipal.java`**

Interfaz gráfica desarrollada con NetBeans Swing:

#### Componentes:
- **JList** (Oeste): Muestra la lista de títulos de notas
- **JTextArea** (Centro): Área para escribir/leer contenido
- **JTextField** (Arriba): Campo para el título de la nota
- **JLabel** (Superior derecha): Muestra la fecha y hora actual
- **JButton "Guardar"** (Abajo): Guarda la nota actual
- **JButton "+Nueva nota"** (Izquierda): Crea una nueva nota
- **JButton "Buscar"** (Arriba): Realiza búsqueda de notas

#### Funcionalidades:
- Carga automática de notas al iniciar
- Selección de notas en la lista para visualizar contenido
- Búsqueda binaria de notas por título
- Crear nuevas notas
- Guardar cambios
- Actualización automática de fecha y hora

## Flujo de Ejecución

### Inicio
1. La aplicación se lanza
2. `GestorArchivos` escanea la carpeta `~/Notas`
3. Se llena el modelo del `JList` con los títulos encontrados
4. Se muestran las notas ordenadas cronológicamente (más recientes primero)

### Lectura
1. Usuario hace clic en un título de la lista
2. La aplicación busca el archivo asociado
3. `GestorArchivos.leer()` recupera el contenido completo
4. Se muestra el título en el campo de texto
5. Se muestra el contenido en el área de texto

### Escritura
1. Usuario escribe un título en el campo de texto
2. Usuario escribe contenido en el área de texto
3. Usuario pulsa "Guardar"
4. `GestorArchivos.guardar()` genera el nombre con la hora exacta
5. Se escribe el archivo en disco
6. Se actualiza la lista visual inmediatamente

### Búsqueda
1. Usuario ingresa un término en el campo de búsqueda
2. Pulsa "Buscar"
3. `GestorArchivos.buscarBinaria()` realiza búsqueda binaria
4. Los resultados se muestran en la lista
5. Usuario puede hacer clic en los resultados para verlos

## Almacenamiento

### Ubicación
- Ruta: `$HOME/Notas/` (se crea automáticamente si no existe)
- Ejemplo en Linux: `/home/usuario/Notas/`

### Formato de Archivo
```
20260120_143025.txt
```
Contenido:
```
Mi primer título
Este es el contenido de la nota.
Puede tener varias líneas.
```

## Cómo Compilar y Ejecutar

### Compilar
```bash
cd /ruta/al/proyecto
ant jar
```

### Ejecutar
```bash
java -jar dist/Diario.jar
```

## Tecnologías Utilizadas
- **Java 8+**
- **Swing** para interfaz gráfica
- **Java NIO** para manejo de archivos
- **Apache Ant** para compilación
- **SimpleDateFormat** para formateo de fechas

## Notas de Desarrollo
- No se modifica el código generado por NetBeans dentro de los bloques protegidos
- Toda la lógica adicional se implementa en métodos separados fuera de los bloques GEN-BEGIN/GEN-END
- La búsqueda binaria optimiza las búsquedas en aplicaciones con muchas notas
- Los archivos se ordenan automáticamente por fecha gracias al formato del nombre
