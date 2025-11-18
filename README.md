# Geometric Shapes 2D/3D

Interactive Java application for calculating properties of 2D and 3D geometric shapes using dialog-based input.

## Supported Shapes

### Two-Dimensional
- Line (length calculation)
- Triangle (perimeter, area)
- Rectangle (perimeter, area)
- Diamond (perimeter, area)

### Three-Dimensional
- Triangular Prism (surface area, volume)
- Cube (surface area, volume)

## Quick Start

```powershell
Push-Location "g:\My Drive\GITHUB\java\java_geometric_shapes_2d3d"
javac GeometricShapes2D3D.java Line.java Triangle.java Rectangle.java Diamond.java Cube.java TriangularPrism.java
java GeometricShapes2D3D
Pop-Location
```

## Usage

Select a shape by number, enter requested coordinates or dimensions via dialog prompts, then view calculated properties.

## Notes

- All shapes use coordinate-based or dimension-based input
- Results display in formatted dialog boxes
- Program runs in a loop until exit is selected
