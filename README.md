# 🚀 Selenium + Docker + NoVNC en Codespaces

## Cómo usarlo

1. Crear Codespace en este repo.
2. En la terminal correr:
   ```bash
   docker-compose up -d
   ```
3. Ir a la pestaña **Ports** de Codespaces.
   - Abrir el puerto **7900** en el navegador.
   - Contraseña: `secret`.
4. Correr el test con:
   ```bash
   mvn clean compile exec:java -Dexec.mainClass=DockerTest
   ```
   (o ejecutar `DockerTest.java` desde el IDE integrado).
5. Ver la ejecución en vivo en la ventana de NoVNC.
