{
  pkgs ? import <nixpkgs> { },
}:

pkgs.mkShell {
  buildInputs = with pkgs; [
    jdk17
    jdt-language-server
    google-java-format
  ];

  shellHook = ''
    echo "COMPX201 Java 17 environment loaded"
    export JAVA_HOME=${pkgs.jdk17}/lib/openjdk
  '';
}
