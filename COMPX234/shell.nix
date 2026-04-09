{
  pkgs ? import <nixpkgs> { },
}:

pkgs.mkShell {
  buildInputs = with pkgs; [
    dotnet-sdk_8
    omnisharp-roslyn
    netcoredbg
  ];

  shellHook = ''
    echo "COMPX234 C# / .NET 8 environment loaded"
    export DOTNET_ROOT="${pkgs.dotnet-sdk_8}";
    export PATH="${pkgs.dotnet-sdk_8}/bin:$PATH"
  '';
}
