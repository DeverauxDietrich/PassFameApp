# PassFameApp

## Overview
PassFameApp is a simple Android application built for educational purposes. It allows users to input an age and find a famous person who passed away at that age. The app includes a list of historical figures and their ages at the time of death, providing an interactive and engaging way for users to learn about history.

![Alt text](images/homepage.png)
![Alt text](images/results.png)



## Features
1. **Age Matching**: Users can input an age, and the app will display the name of a famous person who passed away at that age.
2. **Error Handling**: The app validates user input to ensure it is a whole number between 20 and 100. It provides constructive feedback for invalid inputs.
3. **Clear Functionality**: Users can reset the app to its initial state with a clear button.
4. **Custom Background**: The app features a custom PNG background to enhance the user interface.
5. **Layout Enhancement**: The UI has been improved with an oval white shape around the age input field for better visibility.

## Implementation
The app is built using Kotlin in Android Studio. It utilizes a `RelativeLayout` for the main layout, with a custom background image from Canva.com. The list of historical figures and their ages at the time of death is hardcoded into the app. The app uses a `LinearLayout` to organize the age input field, submit button, clear button, and output text view at the bottom of the screen.

## Usage
1. **Enter Age**: Users can enter an age into the text field.
2. **Submit Button**: Clicking the submit button will display the name of a famous person who passed away at the entered age.
3. **Clear Button**: Clicking the clear button will reset the app.
4. **Error Handling**: The app provides feedback for invalid age inputs, encouraging users to enter a valid age between 20 and 100.

## References
- Background image: Canva.com (https://www.canva.com/)
- Historical figure deaths: [Daily Infographic](https://www.dailyinfographic.com/famous-figure-deaths)
- GitHub: Help with push issues and version control.
- Stackoverflow: Help with syntax and errors (https://stackoverflow.com/)

## Future Enhancements
1. **Dynamic Data**: Load historical figures and their ages from an external data source for scalability.
2. **Improved UI**: Enhance the user interface with more interactive elements and animations.
3. **Search Functionality**: Allow users to search for historical figures by name or age.
4. **Localization**: Support multiple languages for a wider audience.

## Conclusion
PassFameApp is a simple yet informative app that provides users with an engaging way to learn about historical figures and their ages at the time of death. With its intuitive interface and error handling features, the app offers a seamless user experience for educational purposes.
