#!/bin/bash

# Script para compilar y ejecutar el programa de emails

echo "🔧 Compilando..."
javac -cp "lib/*" -d target/classes src/main/java/com/mycompany/emails/*.java

if [ $? -eq 0 ]; then
    echo "✅ Compilación exitosa"
    echo "📧 Ejecutando programa..."
    java -cp "target/classes:lib/*" com.mycompany.emails.Emails
else
    echo "❌ Error en la compilación"
    exit 1
fi
