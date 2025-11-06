# Week 5 – Adapter Pattern Lab: Robot Control Adapter

## Objective
Learn how to use the Adapter design pattern to bridge incompatible interfaces. Adapt a legacy robot control system to work with a modern controller interface.

## Scenario
You are integrating a new robot controller that issues commands in degrees and meters. However, the existing robot hardware only understands radians and acceleration-based movement.

### New Controller Interface
- `turn(double degrees)` — turns the robot by a specified number of degrees.
- `move(double meters)` — moves the robot forward by a specified distance.

### Legacy Robot Interface
- `rotate(double radians)` — rotates the robot by a specified number of radians.
- `accelerate(double speed, double duration)` — moves the robot using speed and duration.

## Your Task
Implement a `RobotAdapter` class that adapts the `RobotController` interface to the `LegacyRobot` class.

### Technical Guidance
- **Degrees to Radians Conversion**:  
  `radians = degrees × π / 180`

- **Basic distance Formula**:  
  Assume constant speed:  
  `distance = speed × duration`  


## Pattern Roles
- **Target (Expected Interface):** `RobotController` — defines `turn()` and `move()` methods.
- **Adaptee (Legacy Interface):** `LegacyRobot` — defines `rotate()` and `accelerate()`.
- **Adapter:** `RobotAdapter` — implements `RobotController` and delegates to `LegacyRobot`.
- **Client:** `Main` — uses `RobotController` to issue commands.

## Reflective Questions
1. What are the pros and cons of using an adapter versus rewriting the legacy class?

pros:
- Using adapter lets you use old legacy code without changing it
- rewriting is old legacy code is more risky
- If the old code is stable you can keep it intact by using an adapter, especially useful when you cant risk breaking the old code

cons:
- It adds an extra layer of abstraction, one more class and one more layer of abstraction
- The extra layer of class can make debugging harder
- since the adapter wraps around old legacy code you cant easily fix or optimize issues inside the old code itself

2. How does the Adapter pattern help with integrating third-party or legacy systems?

- Adapter pattern lets you wrap your old code which is working and stable with a new class, which reduces the risk of breaking working code
- If you dont own the third-party code you wont risk breaking it by using an adapter
- you dont have to understand the logic of the third party code which will be managed by third-party
- you dont have to write new tests for legacy code

3. How would you handle adapting more complex behaviors, like obstacle avoidance or path planning? Would you still use an adapter?

- If the legacy code already knows how to handle the complex behaviors, I would still use an adapter
- If it lacks necessary capacity then i will try to add additional
- I will build a new system that uses the legacy code as the low-level functions while the new layer will handel the logic
