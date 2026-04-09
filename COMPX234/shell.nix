{
  pkgs ? import <nixpkgs> { },
}:

pkgs.mkShell {
  buildInputs = with pkgs; [
    mono
    dotnet-sdk_10
  ];

  shellHook = ''
    echo "COMPX201 Development Environment Loaded"
    export DOTNET_ROOT="${pkgs.dotnet-sdk_10}"
    export PATH="$PATH:$HOME/.dotnet/tools"
    export MONO_HOME="${pkgs.mono}"
    echo "dotnet: $(dotnet --version)"
    echo "mono: $(mono --version | head -n 1)"
  '';
}
