# Proyecto de Envío de Emails en Java

Este proyecto permite enviar emails usando Jakarta Mail con diferentes proveedores SMTP.

## 🚀 Configuración Rápida para Desarrollo

### 1. Clonar y configurar
```bash
git clone <tu-repo>
cd Emails
cp config/config.prop.example config/config.prop
```

### 2. Para desarrollo local (sin internet)
```bash
# Ejecutar MailHog (servidor SMTP local)
./tools/mailhog

# En otra terminal, ejecutar el programa
./run.sh
```

### 3. Ver los emails
- Abre tu navegador en: http://localhost:8025
- Ahí verás todos los emails "enviados" por tu aplicación

## 📧 Configuración para Producción

### SendGrid (Recomendado)
1. Crear cuenta en https://sendgrid.com
2. Generar API Key
3. Verificar email remitente
4. Editar `config/config.prop` con tus credenciales

### Gmail
1. Habilitar verificación en 2 pasos
2. Generar contraseña de aplicación
3. Editar `config/config.prop` con tus credenciales

## 🛠️ Estructura del Proyecto

```
├── src/main/java/com/mycompany/emails/
│   ├── Emails.java          # Clase principal
│   └── Mail.java            # Clase para envío de emails
├── config/
│   ├── config.prop.example  # Archivo de ejemplo
│   └── config.prop          # Tu configuración (no se sube a Git)
├── lib/                     # Dependencias JAR
├── tools/                   # Herramientas de desarrollo
└── target/                  # Archivos compilados
```

## 🏃‍♂️ Ejecutar

```bash
# Compilar
javac -cp "lib/*" -d target/classes src/main/java/com/mycompany/emails/*.java

# Ejecutar
java -cp "target/classes:lib/*" com.mycompany.emails.Emails
```

## 📝 Notas de Seguridad

- ⚠️ **NUNCA** subas credenciales reales a Git
- ✅ Usa `config.prop.example` como referencia
- ✅ El archivo `config.prop` está en `.gitignore`
