# 🌾 Agricultural Yield Analysis using Simple Linear Regression
Linear regression analysis of fertilizer impact on crop yield

## 📌 Project Overview

This project provides a comprehensive statistical analysis using **Simple Linear Regression** to determine how the quantity of fertilizer (X) influences agricultural yield (Y). The script performs everything from initial data visualization to advanced econometric testing, including ANOVA and residual diagnostics.

## 🛠 Features

The Python script (`Agri_Regression.py`) executes a full data science workflow:

- **Data Management**: Organizes raw data into Pandas DataFrames and exports results to CSV
- **Visual Diagnostics**: Generates scatter plots with regression lines and residual plots to check model assumptions
- **Mathematical Modeling**: Calculates the Ordinary Least Squares (OLS) estimators for the intercept (b₀) and slope (b₁)
- **Statistical Inference**:
  - Calculates 95% Confidence Intervals for all parameters
  - Performs T-tests for coefficient significance
  - Executes a Global F-test and builds a complete ANOVA table
- **Validation**: Runs the Shapiro-Wilk test to verify the normality of residuals
- **Econometric Interpretation**: Provides actionable insights for agricultural decision-making

## 📊 Dataset

The analysis is based on 10 years of observations (2001–2010):

- **X (Fertilizer)**: Independent variable (quantity in units)
- **Y (Yield)**: Dependent variable (agricultural output in units)

| Year | Fertilizer (X) | Yield (Y) |
|------|---------------|-----------|
| 2001 | 6.0 | 40.0 |
| 2002 | 10.0 | 44.0 |
| 2003 | 12.0 | 46.0 |
| 2004 | 14.0 | 48.0 |
| 2005 | 16.0 | 52.0 |
| 2006 | 18.0 | 58.0 |
| 2007 | 22.0 | 60.0 |
| 2008 | 24.0 | 68.0 |
| 2009 | 26.0 | 74.0 |
| 2010 | 32.0 | 80.0 |

## 🚀 Installation & Usage

### Clone the repository:
```bash
git clone https://github.com/Wissem-Sahli-Engineer/Agricultural-yield-analysis.git
cd Agricultural-yield-analysis
